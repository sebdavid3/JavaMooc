import java.util.Scanner;

public class Number_and_sum_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum,number,n_number;
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
        System.out.println("Number of numbers: "+n_number);
        System.out.println("Sum of the numbers: "+sum);
    }
    }

