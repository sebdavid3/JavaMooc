import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        while(true){
            int n = sc.nextInt();
            if (n == 0){
                break;
            }
            numeros.add(n);
        }

        System.out.println(numeros.get(1) + numeros.get(2));
    }

}
