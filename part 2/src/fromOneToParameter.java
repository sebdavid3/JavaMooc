public class fromOneToParameter {
    public static void main(String[] args) {
        printUntilNumber(10);
    }
    public static void printUntilNumber(int number){
        int i= 1;
        while(i <= number){
            System.out.println(i);
            i++;
        }
    }
}
