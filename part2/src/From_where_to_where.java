import java.util.Scanner;

public class From_where_to_where {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Where to? ");
        int upNumber = sc.nextInt();

        System.out.println("Where from? ");
        int loNumber = sc.nextInt();

        for(int i = loNumber; i <= upNumber; i++){
            System.out.println(i);
        }
    }
}
