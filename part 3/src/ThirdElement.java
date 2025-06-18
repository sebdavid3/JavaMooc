import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        String nuevo;

        while(true){
            System.out.print("Escribe un nombre: ");
            nuevo = sc.nextLine();

            if (nuevo.equals(" ")){
                break;
            }
            names.add(nuevo);
        }

        System.out.println(names.get(2));


    }
}
