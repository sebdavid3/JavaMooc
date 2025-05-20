import java.util.Scanner;

public class number_of_negative_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a;

        n = 0;
        while (true) {
            System.out.println("Give a number: ");
            a = Integer.parseInt(sc.nextLine());


            if (a == 0) {
                break;
            }

            if (a<0){
                n++;
            }
        }
        System.out.println("Number of negatives: " +n);
    }
}
