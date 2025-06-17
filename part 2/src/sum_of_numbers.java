import java.util.Scanner;

public class sum_of_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        while (true){

            System.out.println("Give a number: ");
            number = sc.nextInt();

            sum += number;
            if(number == 0){
                break;
            }
        }
        System.out.println("Sum of the numbers: "+sum);
    }
}
