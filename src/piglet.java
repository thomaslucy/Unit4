import java.util.Scanner;
public class piglet{
public static String Rolldice() {
        Scanner scan = new Scanner(System.in);
        int dice = (int) (Math.random() * 6 + 1);
        int score = 0;
        String choice = scan.next();
        if (choice.equals("yes")){
            return "You got "+score+"points.";
        }

        while (dice != 1 && choice.equals("no")){
            score += dice;
            return "You rolled a "+dice+"!\nRoll again?";
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Piglet!");
        System.out.println("You rolled a" + Rolldice());
    }
}