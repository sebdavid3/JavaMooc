import java.util.Scanner;

public class average_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum,number,n_number;
        double avg;
        sum = 0;
        n_number = 0;

        while (true){

            System.out.println("Give a number: ");
            number = sc.nextInt();

            if(number == 0){
                break;
            }

            n_number += 1;
            sum += number;

        }
        avg = (double) sum /n_number;
        System.out.println("Average  of numbers: "+avg);

    }
}
