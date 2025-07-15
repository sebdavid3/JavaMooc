public class divisibleByThree {
    public static void main(String[] args) {
        divisibleByThreeInRange(1,10);
    }
    public  static void divisibleByThreeInRange(int n1, int n2){
        double div;
        for(int i = n1; i<= n2 ; i++){
            div = (double) i/3;
            double pDecimal = div - (int) div;
            if(pDecimal == 0){
                System.out.println(i);
            }
        }
    }
}
