import java.util.Scanner;

public class only_positives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        n=0;
        while (true){
            System.out.println("Give a number: ");
            n = Integer.parseInt(sc.nextLine());

            if(n==0){
                break;
            }
            if (n<0) {
                System.out.println("Unsuitable number");
                continue;
            }

        }

    }
}
