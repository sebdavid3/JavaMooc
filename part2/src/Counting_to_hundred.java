import java.util.Scanner;

public class Counting_to_hundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loNumber = sc.nextInt();

        for (int i = loNumber; i <= 100; i++){
            System.out.println(i);
        }
    }
}
