import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();


        while(true){
            String newName = sc.nextLine();
            if (newName.equals(" ")){
                break;
            }
            names.add(newName);
        }

        int size = names.size();
        System.out.println(size);
    }
}
