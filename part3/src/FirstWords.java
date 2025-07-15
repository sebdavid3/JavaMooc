package part3.src;

import java.util.Scanner;

public class FirstWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String s = sc.nextLine();
            if(s.isEmpty()){break;}

            String[] words = s.split(" ");
            System.out.println(words[0]);
        }
    }
}
