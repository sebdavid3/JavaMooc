import java.util.Scanner;

public class average_of_positive_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int positiveNumberCount = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = sc.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                positiveNumberCount += 1;
                sum += number;
            }
        }

        if (positiveNumberCount > 0) {
            double avg = (double) sum / positiveNumberCount;
            System.out.println("Average of the positive numbers: " + avg);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}