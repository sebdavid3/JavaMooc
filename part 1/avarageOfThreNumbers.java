import java.util.Scanner;

public class avarageOfThreNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int third = Integer.valueOf(scanner.nextLine());

        double answer = (double) (first+second+third)/3;
        System.out.print("The average is "+ answer);
    }
}
