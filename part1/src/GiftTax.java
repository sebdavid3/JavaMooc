import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value,l_bound, tax_lw;
        double tax_rate,tax;
        System.out.println("Value of the gift?");
        value = sc.nextInt();

        if (value<5000){
            System.out.println("No tax");
        }
    if (value>=5000) {
        if (value < 25000) {
            l_bound = 5000;
            tax_lw = 100;
            tax_rate = 0.08;
        } else if (value <= 55000) {
            l_bound = 25000;
            tax_lw = 1700;
            tax_rate = 0.10;
        } else if (value <= 200000) {
            l_bound = 55000;
            tax_lw = 4700;
            tax_rate = 0.12;
        } else if (value <= 1000000) {
            l_bound = 200000;
            tax_lw = 22100;
            tax_rate = 0.15;
        } else {
            l_bound = 1000000;
            tax_lw = 142100;
            tax_rate = 0.17;
        }
        tax = tax_lw + (value - l_bound) * tax_rate;
        System.out.println("Tax: "+ tax);
    }
    }
}
