import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            numbers.add(n);
        }

        System.out.println("Search for? :");
        int target = sc.nextInt();
        System.out.println(target+ " is at index "+ indexOf(numbers,target));
    }

    public static Integer indexOf(ArrayList<Integer> array, Integer target) {
        int i = 0;
        while(!array.get(i).equals(target)){
            i++;
        }
        return i;
    }
}
