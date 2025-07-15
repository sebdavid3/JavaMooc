
public class advancedAstrology {
    public static void printSpace(int nSpace){
        for (int i = 1; i<= nSpace; i++){
            System.out.print(" ");
        }
    }

    public static void printStart(int nStarts){
        for (int i = 1; i<= nStarts; i++){
            System.out.print("*");
        }    }

    public static void printingTriangle(int size){
        for (int i= 1; i<size; i++){
            printSpace(size-i);
            printStart(i);
            System.out.println();
        }
    }

    public static void christmasTree(int height){
        int nstart = 1;

        for (int i= 1; i<height; i++){
            printSpace(height-i);
            printStart(nstart);
            System.out.println();
            nstart+=2;
        }
        printSpace(height-2);
        printStart(3);
        System.out.println();
        printSpace(height-2);
        printStart(3);


    }

    public static void main(String[] args) {
        christmasTree(10);
    }
}
