import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true){
            int n = sc.nextInt();
            if (n == -1){
                break;
            }
            numbers.add(n);
        }

        System.out.println("From where?");
        int from = sc.nextInt();

        System.out.println("To where?");
        int to = sc.nextInt();

        for (int i = from;  i <= to ; i++){
            System.out.println(numbers.get(i));
        }


    }
}
