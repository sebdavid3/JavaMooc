import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            String name = sc.nextLine();
            if (name.isEmpty()){
                break;
            }
            names.add(name);
        }
        String target;
        System.out.println("Search for? :");
        target = sc.nextLine();
        if (names.contains(target)){
            System.out.println(target+ " was found");
        }else {
            System.out.println(target+ " was not found");
        }
    }
}
