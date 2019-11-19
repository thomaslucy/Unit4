/*
Lucy Thomas
11/19/2019
This program let's you play the game piglet in which you roll a die and if the
roll is one you lose the game, but if you roll a two through six you keep accumulating
points until you decide to stop rolling, then you get your total points.
 */
import java.util.Scanner;
public class piglet{
public static void Rolldice() {
        Scanner scan = new Scanner(System.in);
        int dice = 0;
        int score = 0;
        while (true){
            dice= (int)(Math.random() * 6 + 1);
            if (dice == 1) {
                score = 0;
                System.out.println("You rolled a "+dice+"!\nYou got 0 points.");
                break;
            }
            else {
                score += dice;
                System.out.println("You rolled a "+dice+"!\nRoll again?");
                String play = scan.next();
                if (play.equals("no")){
                    System.out.println("You got "+score+" points");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Piglet!");
        Rolldice();
    }
}