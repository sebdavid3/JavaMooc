import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        System.out.println("Give two indices to swap: ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        int pivot = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = pivot;

        System.out.println("The numbers after the swap: ");
        for (int number : numbers) {
            System.out.println(number);
        }


    }
}
