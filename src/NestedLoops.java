public class NestedLoops {
    public static String xSquare(){
        String s = "";
        for (int x = 1; x <= 5; x++){
            for (int y = 1; y <= 5; y++)
                s += "#";
            s += "\n";
        }
        return s;
    }

    public static String xSquare2(int n){
        String s = "";
        for (int x = 1; x <= n; x++){
            for (int y = 1; y<= n; y++)
                s += "#";
            s += "\n";
        }
        return s;
    }

    public static String flippedTriangle(int n){
        String s = "";
        for (int x = 1; x <= n; x++){
            for (int y = x; y <= n; y++)
                s += "*";
            s += "\n";
        }
        return s;
    }

    public static String multiplicationTable(){
        String s = "";
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++)
                s += x*y + " ";
                s += "\n";
        }
        if (s.length()==1)
            s += "  ";
        return s;
    }

    public static void main(String[] args){
        //System.out.println(xSquare());
        //System.out.println(xSquare2(8));
        //System.out.println(flippedTriangle(7));
        System.out.println(multiplicationTable());
    }
}
