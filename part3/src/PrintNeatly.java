public class PrintNeatly {
    public static void main(String[] args) {
        int[] array = {5,1,3,4,2};
        printNeatly(array );
    }
    public static void printNeatly(int[] array){
        int n = 0;
        while(n < array.length){
            if (n == array.length - 1) {
                System.out.print(array[n]);
            } else {
                System.out.print(array[n] + ", ");
            }
            n++;

        }
    }
}
