package part3.src;

import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            }

            String[] words = s.split(" ");
            System.out.println(words[words.length - 1]);
        }

    }
}
