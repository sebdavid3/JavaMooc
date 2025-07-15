import java.util.Scanner;

public class are_we_there_yet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n=0;
        while(n!=4){
            System.out.println("Give a number: ");
            n = Integer.parseInt(sc.nextLine());
        }
    }
}
