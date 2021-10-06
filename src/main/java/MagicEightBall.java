import java.util.Scanner;

public class MagicEightBall {
    public static void main(String[] args) {
        System.out.println("Ask me anything.");

        Scanner scanner = new Scanner(System.in);
        // not necessary to store user input
        String userInput = scanner.next();
        scanner.close();

        System.out.println("Cool Story, Bro.");

    }
}
