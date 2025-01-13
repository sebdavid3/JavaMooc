import java.util.Scanner;

public class Reading_Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write text and press enter ");
        String text = scanner.nextLine();
        System.out.println("You wrote " + text);


        // String to integer
        String valueAsString = "42";
        int value = Integer.valueOf(valueAsString);

        System.out.println(value);


    }
}
