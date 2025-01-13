import java.util.Scanner;

public class OrwellNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orwell = 1983;

        System.out.println("Give a number: ");
        int userNumber = scanner.nextInt();

        if (userNumber==orwell){
            System.out.println("Orwell");
        }
    }
}
