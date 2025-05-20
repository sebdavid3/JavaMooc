import java.util.Scanner;

public class number_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        n=0;
        while (true){
            System.out.println("Give a number: ");
            int a = Integer.parseInt(sc.nextLine());

            if(a == 0){
                break;
            }

            n++;

        }
        System.out.println("Number of numbers: "+ n);
    }
}
