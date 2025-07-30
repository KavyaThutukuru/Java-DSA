import java.util.*;
public class printAltRowsRev{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<List<Integer>> matrix = new ArrayList<>();
        while (true) {
            String line = sc.nextLine();
            if (line.trim().isEmpty()) break;

            String[] parts = line.split(" ");
            List<Integer> row = new ArrayList<>();
            for (String part : parts) {
                row.add(Integer.parseInt(part));
            }
            matrix.add(row);
        }
        for(int i=matrix.size()-1;i>=0;i-=2){
            for (int num : matrix.get(i)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}