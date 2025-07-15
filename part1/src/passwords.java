
import java.util.Scanner;
public class passwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pw,msg;

        System.out.println("Write a password");
        pw = sc.nextLine();

        if(pw.equals("Caput Draconis")){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you");
        }

    }
}