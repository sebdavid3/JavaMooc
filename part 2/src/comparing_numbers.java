import java.util.Scanner;

public class comparing_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        a= sc.nextInt();
        b=sc.nextInt();

        if (a>b){
            System.out.println(a+ " is greater than "+b);
        }else{System.out.println(b + " is greater than "+a);
        }
    }
}
