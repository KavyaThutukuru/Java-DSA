import java.util.*;
interface Switchable {
    void turnOn();
    void turnOff();
}
interface Dimmable {
    void setBrightness(int level);
}
abstract class Appliance implements Switchable, Cloneable {
    private int id;
    private String name;
    private boolean status; 
    private double powerRating;

    public Appliance(int id, String name, double powerRating) {
        this.id = id;
        this.name = name;
        this.powerRating = powerRating;
        this.status = false; 
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return status;
    }

    public double getPowerRating() {
        return powerRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerRating(double powerRating) {
        this.powerRating = powerRating;
    }

    @Override
    public void turnOn() {
        status = true;
    }

    @Override
    public void turnOff() {
        status = false;
    }

    public abstract void displayInfo();
    
    @Override
    public Appliance clone() {
        try {
            return (Appliance) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; 
        }
    }
}
class Light extends Appliance implements Dimmable {
    private int brightness; 

    public Light(int id, String name, double powerRating, int brightness) {
        super(id, name, powerRating);
        setBrightness(brightness);
    }

    public int getBrightness() {
        return brightness;
    }

    @Override
    public void setBrightness(int level) {
        if (level < 0 || level > 100) {
            System.out.println("Brightness must be between 0 and 100.");
        } else {
            this.brightness = level;
        }
    }

    @Override
    public void displayInfo() {
        System.out.printf("Light [ID: %d, Name: %s, Status: %s, Power: %.2fW, Brightness: %d%%]%n",
                getId(), getName(), (isOn() ? "ON" : "OFF"), getPowerRating(), brightness);
    }

    @Override
    public Light clone() {
        Light cloned = (Light) super.clone();
        cloned.brightness = this.brightness;
        return cloned;
    }
}
class Fan extends Appliance {
    private int speed; 

    public Fan(int id, String name, double powerRating, int speed) {
        super(id, name, powerRating);
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 1 || speed > 5) {
            System.out.println("Speed must be between 1 and 5.");
        } else {
            this.speed = speed;
        }
    }

    @Override
    public void displayInfo() {
        System.out.printf("Fan [ID: %d, Name: %s, Status: %s, Power: %.2fW, Speed: %d]%n",
                getId(), getName(), (isOn() ? "ON" : "OFF"), getPowerRating(), speed);
    }

    @Override
    public Fan clone() {
        Fan cloned = (Fan) super.clone();
        cloned.speed = this.speed;
        return cloned;
    }
}
class ApplianceManager {
    private Map<Integer, Appliance> appliances = new HashMap<>();
    private Deque<Map<Integer, Appliance>> historyStack = new ArrayDeque<>();

    private void saveState() {
        Map<Integer, Appliance> snapshot = new HashMap<>();
        for (Map.Entry<Integer, Appliance> entry : appliances.entrySet()) {
            snapshot.put(entry.getKey(), cloneAppliance(entry.getValue()));
        }
        historyStack.push(snapshot);
    }

    private Appliance cloneAppliance(Appliance a) {
        return a.clone();
    }

    public boolean addAppliance(Appliance a) {
        if (appliances.containsKey(a.getId())) {
            System.out.println("Error: Appliance ID must be unique.");
            return false;
        }
        saveState();
        appliances.put(a.getId(), a);
        System.out.println("Appliance added successfully.");
        printStatusSummary();
        return true;
    }

    public Appliance getApplianceById(int id) {
        return appliances.get(id);
    }

    public boolean updateApplianceName(int id, String newName) {
        Appliance a = appliances.get(id);
        if (a == null) {
            System.out.println("Appliance not found.");
            return false;
        }
        saveState();
        a.setName(newName);
        System.out.printf("Appliance ID %d name updated to [%s].%n", id, newName);
        printStatusSummary();
        return true;
    }

    public boolean deleteAppliance(int id) {
        if (!appliances.containsKey(id)) {
            System.out.println("Appliance not found.");
            return false;
        }
        saveState();
        appliances.remove(id);
        System.out.println("Appliance deleted successfully.");
        printStatusSummary();
        return true;
    }

    public boolean turnOnAppliance(int id) {
        Appliance a = appliances.get(id);
        if (a == null) {
            System.out.println("Appliance not found.");
            return false;
        }
        saveState();
        a.turnOn();
        System.out.println("Appliance turned ON.");
        printStatusSummary();
        return true;
    }

    public boolean turnOffAppliance(int id) {
        Appliance a = appliances.get(id);
        if (a == null) {
            System.out.println("Appliance not found.");
            return false;
        }
        saveState();
        a.turnOff();
        System.out.println("Appliance turned OFF.");
        printStatusSummary();
        return true;
    }

    public boolean setBrightness(int id, int brightness) {
        Appliance a = appliances.get(id);
        if (a == null) {
            System.out.println("Appliance not found.");
            return false;
        }
        if (!(a instanceof Light)) {
            System.out.println("Appliance is not a Light.");
            return false;
        }
        Light light = (Light) a;
        if (brightness < 0 || brightness > 100) {
            System.out.println("Brightness must be between 0 and 100.");
            return false;
        }
        saveState();
        light.setBrightness(brightness);
        System.out.printf("Appliance [%s] brightness successfully set to %d.%n", light.getName(), brightness);
        System.out.printf("Current Status: %s%nPower Consumption: %.1f watts%n", 
                (light.isOn() ? "ON" : "OFF"), light.isOn() ? light.getPowerRating() : 0.0);
        printStatusSummary();
        return true;
    }

    public boolean setSpeed(int id, int speed) {
        Appliance a = appliances.get(id);
        if (a == null) {
            System.out.println("Appliance not found.");
            return false;
        }
        if (!(a instanceof Fan)) {
            System.out.println("Appliance is not a Fan.");
            return false;
        }
        if (speed < 1 || speed > 5) {
            System.out.println("Speed must be between 1 and 5.");
            return false;
        }
        saveState();
        Fan fan = (Fan) a;
        fan.setSpeed(speed);
        System.out.printf("Appliance [%s] speed successfully set to %d.%n", fan.getName(), speed);
        System.out.printf("Current Status: %s%nPower Consumption: %.1f watts%n", 
                (fan.isOn() ? "ON" : "OFF"), fan.isOn() ? fan.getPowerRating() : 0.0);
        printStatusSummary();
        return true;
    }

    public boolean updateLightAttributes(int id, String newName, int brightness) {
        Appliance a = appliances.get(id);
        if (a == null) {
            System.out.println("Appliance not found.");
            return false;
        }
        if (!(a instanceof Light)) {
            System.out.println("Appliance is not a Light.");
            return false;
        }
        if (brightness < 0 || brightness > 100) {
            System.out.println("Brightness must be between 0 and 100.");
            return false;
        }
        saveState();
        a.setName(newName);
        ((Light) a).setBrightness(brightness);
        System.out.printf("Appliance ID %d updated: Name set to [%s], Brightness set to %d.%n",
                id, newName, brightness);
        printStatusSummary();
        return true;
    }

    public boolean updateFanAttributes(int id, String newName, int speed) {
        Appliance a = appliances.get(id);
        if (a == null) {
            System.out.println("Appliance not found.");
            return false;
        }
        if (!(a instanceof Fan)) {
            System.out.println("Appliance is not a Fan.");
            return false;
        }
        if (speed < 1 || speed > 5) {
            System.out.println("Speed must be between 1 and 5.");
            return false;
        }
        saveState();
        a.setName(newName);
        ((Fan) a).setSpeed(speed);
        System.out.printf("Appliance ID %d updated: Name set to [%s], Speed set to %d.%n",
                id, newName, speed);
        printStatusSummary();
        return true;
    }

    public void listAllAppliances() {
        if (appliances.isEmpty()) {
            System.out.println("No appliances found.");
            return;
        }
        for (Appliance a : appliances.values()) {
            a.displayInfo();
        }
        printStatusSummary();
    }

    public void calculateTotalPowerConsumption() {
        double totalPower = 0.0;
        Map<String, Double> powerByType = new HashMap<>();
        Map<String, List<String>> onApplianceDetails = new HashMap<>();

        onApplianceDetails.put("Lights", new ArrayList<>());
        onApplianceDetails.put("Fans", new ArrayList<>());
        for (Appliance a : appliances.values()) {
            if (a.isOn()) {
                double powerUsed;
                String type;
                if (a instanceof Light) {
                    Light light = (Light) a;
                    powerUsed = light.getPowerRating() * (light.getBrightness() / 100.0);
                    type = "Lights";
                    powerByType.put(type, powerByType.getOrDefault(type, 0.0) + powerUsed);
                    onApplianceDetails.get(type).add(String.format(" - %s: %.1fW (ON) at %d%% brightness", light.getName(), powerUsed, light.getBrightness()));
                }   else if (a instanceof Fan) {
                    powerUsed = a.getPowerRating();
                    type = "Fans";
                    powerByType.put(type, powerByType.getOrDefault(type, 0.0) + powerUsed);
                    onApplianceDetails.get(type).add(String.format(" - %s: %.1fW (ON)", a.getName(), powerUsed));
                } else {
                // If other appliance types added later
                    powerUsed = a.getPowerRating();
                    type = "Others";
                    powerByType.put(type, powerByType.getOrDefault(type, 0.0) + powerUsed);
                    onApplianceDetails.putIfAbsent(type, new ArrayList<>());
                    onApplianceDetails.get(type).add(String.format(" - %s: %.1fW (ON)", a.getName(), powerUsed));
                }

                totalPower += powerUsed;
            }
        }       

        System.out.printf("Total power consumption of ON appliances: %.2f watts%n%n", totalPower);

        System.out.println("Lights:");
        List<String> lightsOn = onApplianceDetails.get("Lights");
        if (lightsOn.isEmpty()) {
            System.out.println("(No Lights ON)");
        } else {
            lightsOn.forEach(System.out::println);
        }

        System.out.println("\nFans:");
        List<String> fansOn = onApplianceDetails.get("Fans");
        if (fansOn.isEmpty()) {
            System.out.println("(No fans ON)");
        } else {
            fansOn.forEach(System.out::println);
        }
        System.out.println("------------------------");
    }

    public void printStatusSummary() {
        int total = appliances.size();
        long onCount = appliances.values().stream().filter(Appliance::isOn).count();
        long offCount = total - onCount;
        System.out.println("Current Appliance Status:");
        System.out.printf(" - Total Appliances: %d%n - Appliances ON: %d%n - Appliances OFF: %d%n------------------------%n",
                total, onCount, offCount);
    }

    public boolean undo() {
        if (historyStack.isEmpty()) {
            System.out.println("No operations to undo.");
            return false;
        }
        appliances = historyStack.pop();
        System.out.println("Undo successful. Previous state restored.");
        printStatusSummary();
        return true;
    }
}
public class SmartApplianceControlSystem {
    private static ApplianceManager manager = new ApplianceManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            printMenu();
            choice = readInt("Enter your choice: ");
            System.out.println();

            switch (choice) {
                case 1:
                    addApplianceMenu();
                    break;
                case 2:
                    manager.listAllAppliances();
                    break;
                case 3:
                    updateApplianceName();
                    break;
                case 4:
                    deleteAppliance();
                    break;
                case 5:
                    turnOnAppliance();
                    break;
                case 6:
                    turnOffAppliance();
                    break;
                case 7:
                    setApplianceSpecificAttribute();
                    break;
                case 8:
                    manager.calculateTotalPowerConsumption();
                    break;
                case 9:
                    manager.undo();
                    break;
                case 10:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
            System.out.println();
        } while (choice != 10);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("SMART APPLIANCE CONTROL SYSTEM");
        System.out.println("1. Add Appliance");
        System.out.println("2. View Appliances");
        System.out.println("3. Update Appliance Name");
        System.out.println("4. Delete Appliance");
        System.out.println("5. Turn ON Appliance");
        System.out.println("6. Turn OFF Appliance");
        System.out.println("7. Set Appliance Specific Attribute");
        System.out.println("8. Show Total Power Consumption");
        System.out.println("9. Undo Last Operation");
        System.out.println("10. Exit");
    }

    private static void addApplianceMenu() {
        System.out.print("Enter Appliance Type (1. Light, 2. Fan): ");
        int type = readInt("");

        int id = readInt("Enter ID: ");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        double power = readDouble("Enter Power Rating (in watts): ");

        if (type == 1) { 
            int brightness = readInt("Enter Brightness (0-100): ");
            Light light = new Light(id, name, power, brightness);
            manager.addAppliance(light);
        } else if (type == 2) { 
            int speed = readInt("Enter Speed (1-5): ");
            Fan fan = new Fan(id, name, power, speed);
            manager.addAppliance(fan);
        } else {
            System.out.println("Invalid appliance type.");
        }
    }

    private static void updateApplianceName() {
        int id = readInt("Enter Appliance ID to update name: ");
        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        manager.updateApplianceName(id, newName);
    }

    private static void deleteAppliance() {
        int id = readInt("Enter Appliance ID to delete: ");
        manager.deleteAppliance(id);
    }

    private static void turnOnAppliance() {
        int id = readInt("Enter Appliance ID to turn ON: ");
        manager.turnOnAppliance(id);
    }

    private static void turnOffAppliance() {
        int id = readInt("Enter Appliance ID to turn OFF: ");
        manager.turnOffAppliance(id);
    }

    private static void setApplianceSpecificAttribute() {
        int id = readInt("Enter Appliance ID: ");
        Appliance a = manager.getApplianceById(id);
        if (a == null) {
            System.out.println("Appliance not found.");
            return;
        }
        if (a instanceof Light) {
            int brightness = readInt("Enter new brightness (0-100): ");
            manager.setBrightness(id, brightness);
        } else if (a instanceof Fan) {
            int speed = readInt("Enter new speed (1-5): ");
            manager.setSpeed(id, speed);
        } else {
            System.out.println("Unknown appliance type.");
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            if (!prompt.isEmpty()) System.out.print(prompt);
            try {
                int value = Integer.parseInt(scanner.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double value = Double.parseDouble(scanner.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}