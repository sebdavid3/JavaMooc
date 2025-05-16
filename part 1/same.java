import java.util.Scanner;

public class same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string1, string2;

        System.out.println("Enter the first string: ");
        string1= sc.nextLine();

        System.out.println("Enter the second string: ");
        string2= sc.nextLine();

        if(string1.equals(string2)){
            System.out.println("Same");
        }else{System.out.println("Diferent");}
    }
}