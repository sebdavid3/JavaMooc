import java.util.Scanner;

public class absolute_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        if (a<0){
            a=a*-1;
        }
        System.out.println(a);
    }
}
