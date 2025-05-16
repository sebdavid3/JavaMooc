import java.util.Scanner;

public class GradesAndPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("Give points [0-100]:");
        int points = sc.nextInt();

        if (points < 0 || points > 100) {
            message = "impossible!";
        } else if (points <= 49) {
            message = "failed";
        } else if (points <= 59) {
            message = "1";
        } else if (points <= 69) {
            message = "2";
        } else if (points <= 79) {
            message = "3";
        } else if (points <= 89) {
            message = "4";
        } else if (points <= 99) {
            message = "5";
        } else {
            message = "excelent";
        }

        System.out.println("Grade: " + message);
    }
}