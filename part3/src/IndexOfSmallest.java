import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            int n = sc.nextInt();
            if (n == 9999){
                break;
            }
            numbers.add(n);
        }
        int size = numbers.size();
        int smallest = numbers.get(0);
        for(int i = 0 ; i< size; i++){
            int number = numbers.get(i);
            if(smallest > number){
                smallest= number;
            }
        }

        System.out.println("The smallest number: " + smallest);
        indexOf(numbers,smallest);
    }

    public static void indexOf(ArrayList<Integer> array, Integer target) {

        int size = array.size();
        for (int i = 0; i<size; i++){
            if (target == array.get(i)){
                System.out.println("Found at index: "+ i);
            }
        }

    }

}

