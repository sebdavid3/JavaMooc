
import java.util.Scanner;

public class CheckingAge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.println("How old are you?");
        age= sc.nextInt();

        if(0<age && age <= 120){
            System.out.println("OK");
        }else{System.out.println("Impossible!");}

    }
}