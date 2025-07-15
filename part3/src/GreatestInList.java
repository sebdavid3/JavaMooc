import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            int n = sc.nextInt();
            if (n == -1){
                break;
            }
            numbers.add(n);
        }
        int size = numbers.size();
        int greatest = numbers.get(0);
        for(int i = 0 ; i< size; i++){
            int number = numbers.get(i);
            if(greatest < number){
                greatest= number;
            }
        }
        System.out.println("The greatest number: " + greatest);
    }
}
