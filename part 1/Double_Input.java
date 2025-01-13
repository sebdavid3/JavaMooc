import java.util.Scanner;

public class Double_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String value_double = scanner.nextLine();

        Double number = Double.valueOf(value_double);
        System.out.println("You gave the number: "+number);
    }
}
