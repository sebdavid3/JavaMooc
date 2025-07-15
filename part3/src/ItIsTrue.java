package part3.src;

import java.util.Scanner;

public class ItIsTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a string: ");
        String answer = sc.nextLine();

        if (answer.equals("True")){
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }


    }
}
