import java.util.Scanner;

public class ancient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a year: " );
        int userYear = scanner.nextInt();
        int currentYear = 2025;

        if (userYear<currentYear){
            System.out.println("Ancient history!");
        }


    }
}
