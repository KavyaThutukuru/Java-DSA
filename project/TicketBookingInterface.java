interface Movie {
    double calculatePrice();
    void displayDetails();
}
class BaseMovie implements Movie {
    protected String movieId;
    protected String title;
    protected double ticketPrice;
    protected int numberOfTickets;

    public BaseMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
        this.movieId = movieId;
        this.title = title;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    @Override
    public void displayDetails() {
        System.out.println("Movie Record");
        System.out.println("ID " + movieId);
        System.out.println("Title " + title);
        System.out.println("Ticket Price " + ticketPrice);
        System.out.println("Number of Tickets " + numberOfTickets);

        if (numberOfTickets > 6) {
            System.out.println("Booking Failed: Cannot book more than 6 tickets\n");
        } else {
            double totalPrice = calculatePrice();
            System.out.println("Total Price " + totalPrice + "\n");
        }
    }

    @Override
    public double calculatePrice() {
        return 0.0; // default (to be overridden)
    }
}
class TeluguMovie extends BaseMovie {

    public TeluguMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
        super(movieId, title, ticketPrice, numberOfTickets);
    }

    @Override
    public double calculatePrice() {
        double base = ticketPrice * numberOfTickets;
        double gst = 0.05 * base;
        return base + gst;
    }
}
class HindiMovie extends BaseMovie {

    public HindiMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
        super(movieId, title, ticketPrice, numberOfTickets);
    }

    @Override
    public double calculatePrice() {
        double base = ticketPrice * numberOfTickets;
        double discount = 0.10 * base;
        double discounted = base - discount;
        double gst = 0.05 * discounted;
        return discounted + gst;
    }
}
class EnglishMovie extends BaseMovie {

    public EnglishMovie(String movieId, String title, double ticketPrice, int numberOfTickets) {
        super(movieId, title, ticketPrice, numberOfTickets);
    }

    @Override
    public double calculatePrice() {
        double base = ticketPrice * numberOfTickets;
        double extra3D = 50 * numberOfTickets;
        double total = base + extra3D;
        double gst = 0.05 * total;
        return total + gst;
    }
}
public class TicketBookingInterface {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];

        movies[0] = new TeluguMovie("M101", "RRR", 150.0, 3);
        movies[1] = new HindiMovie("M102", "Pathaan", 200.0, 2);
        movies[2] = new EnglishMovie("M103", "Avatar", 250.0, 7); // exceeds limit

        for (Movie m : movies) {
            m.displayDetails();
        }
    }
}