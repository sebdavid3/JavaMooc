import java.util.Scanner;

public class positivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number :");
        int userNumber = scanner.nextInt();

        if (userNumber>0){
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is not positive");
        }
    }
}
