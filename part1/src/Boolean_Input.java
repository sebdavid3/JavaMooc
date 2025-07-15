import java.util.Scanner;

public class Boolean_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("True or False:");
        String value_double = scanner.nextLine();

        Boolean answer = Boolean.valueOf(value_double);
        System.out.println("You gave the answer: "+answer);
    }
}
