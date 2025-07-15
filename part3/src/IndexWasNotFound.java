package src;

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;


        System.out.println("Search for: ");
        int target = sc.nextInt();
        int n = 0;

        while (n <= numbers.length) {
            if (target == numbers[n]) {
                System.out.println(target + " is at index " + n);
                return;
            }else if (n == numbers.length - 1) {
                System.out.println(target + " was not found in the array.");
                return;}
            n++;
        }

    }
}
