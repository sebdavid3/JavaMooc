import java.util.Scanner;

public class sum_of_squence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Last number? ");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++){
            sum += i;
        }

        System.out.println("The sum is "+sum);

    }
}
