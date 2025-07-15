import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true){
            String nName = sc.nextLine();
            if (nName.equals(" ")){
                break;
            }
            names.add(nName);
        }
        int size = names.size();
        System.out.println(names.get(size-1));
    }
}
