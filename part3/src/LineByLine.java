package part3.src;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
