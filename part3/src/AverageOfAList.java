import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            numbers.add(n);
        }
        int sum = 0;
        for (Integer number : numbers){
            sum +=  number;
        }
        double avg =  (double) sum /numbers.size();
        System.out.println("Avg:"+ avg);

    }
}
