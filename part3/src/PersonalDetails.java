package part3.src;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String longestName = "";
        int count = 0;
        int avgBirth = 0;

        while (true) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] parts = input.split(",");
            String name = parts[0];
            int birthYear = Integer.parseInt(parts[1]);

            count++;
            avgBirth += birthYear;

            // Find the longest name
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        double averageBirth = (double) avgBirth / count;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average age: " + averageBirth);
    }
}
