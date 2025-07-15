public class PrintInStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
        System.out.println("Using V2 method:");
        printArrayInStarsV2(array);

    }
    public static void printArrayInStars(int[] array){
        for (int number : array) {
            String stars = "*";
            System.out.println(stars.repeat(number));
        }
    }

    public static void printArrayInStarsV2(int[] array){
        for (int number : array) {
            for (int n = 0; n < number; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
