import java.util.*;
public class SumBorderEleAltRows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> matrix = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) break;
            String[] parts = line.split(" ");
            int[] row = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                row[i] = Integer.parseInt(parts[i]);
            }
            matrix.add(row);
        }
        int sum = 0;
        for (int i = 0; i < matrix.size(); i += 2) {
            int[] row = matrix.get(i);
            sum += row[0] + row[row.length - 1];
        }
        System.out.println(sum);
    }
}
