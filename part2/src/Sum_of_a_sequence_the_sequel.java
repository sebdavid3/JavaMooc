import java.util.Scanner;

public class Sum_of_a_sequence_the_sequel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number ");
        int first = sc.nextInt();

        System.out.println("Last number ");
        int last = sc.nextInt();

        int sum = 0;

        for(int i=first; i <= last; i++){
            sum += i;
        }

        System.out.println("The sum is " + sum );
    }
}
