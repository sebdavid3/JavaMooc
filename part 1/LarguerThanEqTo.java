import java.util.Scanner;

public class LarguerThanEqTo {
    public static void main(String[] args) {
        int greater;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int first = scanner.nextInt();

        System.out.println("Give the first number: ");
        int second = scanner.nextInt();

        if(first>second){
              greater = first;
        }else{greater = second;}

        System.out.println("The greater number is "+greater);
    }
}
