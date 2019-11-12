import java.util.Scanner;

public class WhileLoops {
    static Scanner scan = new Scanner(System.in);
    public static void fromHereToThere(int a, int b){
        if (a>b) {
            System.out.println("Invalid Input");
        }
        while (a<=b){
            System.out.println(a);
            a+=1;

        }
    }

    public static void factors(int c) {
        int num = 1;
    while (num<=c) {
            num+=1;
     if (c%num==0)
         System.out.println(c/num);
        }
    }
    public static String countPosandNeg(){
        System.out.println("Enter a positive or negative number or 0 to quit: ");
        int pcount = 0;
        int ncount = 0;
        int num = scan.nextInt();
        while (num != 0){
            if (num>0) {
                pcount += 1;
            }
            if (num<0) {
                ncount += 1;
            }
            num = scan.nextInt();
        }
        return "There were "+pcount+" positive and "+ncount+" negative numbers.";
    }
    public static void main(String[] args){
        fromHereToThere(20,30);
        factors(12);
        System.out.println(countPosandNeg());
    }
}
