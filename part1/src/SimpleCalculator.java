import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        int answerM = first*second;
        int answerS = first+second;
        int answerR = first-second;
        double answerD = (double)first/second;
        System.out.printf("%d * %d = %d \n", first, second,answerM);
        System.out.printf("%d + %d = %d\n", first, second,answerS);
        System.out.printf("%d - %d = %d\n", first, second,answerR);
        System.out.printf("%d / %d = %f\n", first, second,answerD);
    }
}
