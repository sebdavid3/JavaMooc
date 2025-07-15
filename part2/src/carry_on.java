import java.util.Scanner;

public class carry_on {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;

        answer = "";
        while (!answer.equals("no")){
            System.out.println("Shall we carry on?");
            answer = sc.nextLine();

        }
    }
}
