package part3.src;

import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oldest = 0;
        String nameOfOldest = "";

        while(true){
            String s = sc.nextLine();
            if(s.isEmpty()) {
                break;
            }
            String[] parts = s.split(",");
            if(Integer.parseInt(parts[1]) > oldest){
                oldest = Integer.parseInt(parts[1]);
                 nameOfOldest = parts[0];
            }
        }

        System.out.println("Age of the oldest: " + oldest);
        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
