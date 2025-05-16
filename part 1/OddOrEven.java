import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        String mensaje;
        System.out.println("Give a number: ");
        n = sc.nextInt();

        if(n % 2 ==0){
            mensaje = "even";
        }else{mensaje = "odd";}

        System.out.println(mensaje);
    }

}