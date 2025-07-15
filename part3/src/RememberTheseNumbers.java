import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> lNumbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            int n = sc.nextInt();
            if (n == -1){
                break;
            }
            lNumbers.add(n);
        }

        int size = lNumbers.size();

        for (int i=0; i<size; i++){
            System.out.println(lNumbers.get(i));
        }

    }
}
