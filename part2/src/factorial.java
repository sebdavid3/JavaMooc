import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f = 1;

        System.out.println("Give a number: ");
        int n = sc.nextInt();

        if (n == 0) {
            f = 1;
        } else {

            for (int i = 1; i <= n; i++) {
                f = i*f;
            }
        }

        System.out.println("Factorial: "+f);


    }
}
