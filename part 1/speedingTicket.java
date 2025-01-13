import java.util.Scanner;

public class speedingTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speedLimit = 120;
        System.out.println("Give speed: ");
        int userSpeed = scanner.nextInt();

        if (userSpeed>speedLimit){
            System.out.println("Speeding ticket");
        }
    }
}
