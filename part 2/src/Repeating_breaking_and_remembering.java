import java.util.Scanner;

public class Repeating_breaking_and_remembering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double avg;
        int n;
        int n_numbers = 0;
        int sum = 0;
        int nEven =0;
        int nOdd = 0;

        System.out.println("Give number ");
        while(true){
            n = sc.nextInt();
            if(n == -1){
                break;
            }

            n_numbers += 1;
            sum += n;

            if(n%2 == 0){
                nEven += 1;
            }else{
                nOdd += 1;
            }
        }
        avg = (double) sum/n_numbers;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+ sum);
        System.out.println("Numbers: "+n_numbers);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + nEven);
        System.out.println("Odd: " + nOdd);

    }
}
