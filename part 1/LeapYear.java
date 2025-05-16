import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Give a year :");
        year = sc.nextInt();
        if(year % 100 == 0 && year % 400 == 0 ){
            System.out.println("The year is a leap year");
        }else if(year % 4 == 0 ){
            System.out.println("The year is a leap year");
        }else{System.out.println("The year is not leap year");}
    }
}