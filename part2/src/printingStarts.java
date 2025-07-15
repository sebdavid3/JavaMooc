public class printingStarts {
    public static void printStars(int number){
        for (int i = 1; i<= number; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int square){
        int i=1;
        while(i<= square) {
            printStars(square);
            i++;
        }
    }

    public static void printTriangle(int triangle){
        int i = 0;
        while (i <= triangle){
            printStars(i);
            i++;
        }
    }

    public static void main(String[] args) {
        printStars(10);
        printSquare(5);
        printTriangle(3);
    }
}
