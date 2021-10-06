import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {
    public static void main(String[] args) {
        System.out.println("Ask me anything.");

        Scanner scanner = new Scanner(System.in);
        // not necessary to store user input
        String userInput = scanner.next();
        scanner.close();

        Random rand = new Random();
        int randomNumber = rand.nextInt(7);

        if (randomNumber == 0) {
            System.out.println("Cool Story, Bro.");
        } else if (randomNumber == 1) {
            System.out.println("I guess so.");
        } else if (randomNumber == 2) {
            System.out.println("Yassssss.");
        } else if (randomNumber == 3) {
            System.out.println("Sounds alright.");
        } else if (randomNumber == 4) {
            System.out.println("Nah, better not.");
        } else if (randomNumber == 5) {
            System.out.println("Just do it.");
        } else if (randomNumber == 6) {
            System.out.println("Yes.");
        } else {
            System.out.println("Don't do it!");
        }
    }
}
