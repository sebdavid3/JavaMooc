package part3.src;

import java.util.Scanner;

public class AVClub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        String s = sc.nextLine();
        if(s.isEmpty()){break;}
        String[] words = s.split(" ");
        for (String word : words) {
            if (word.contains("av")) {
                System.out.println(word);
            }
        }
    }
    }
}
