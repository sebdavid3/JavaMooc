import java.util.Scanner;

public class integer_input {
    public static void main(String[] args) {
        System.out.println("Give a number:");
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        int number = Integer.valueOf(value);
        System.out.println("You gave the number "+number);
    }
}
