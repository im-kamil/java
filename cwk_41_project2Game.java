import java.util.Scanner;
import java.util.Random;

public class cwk_41_project2Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 for Rock, 2 for Paper, 3 for Scissors
        System.out.print("Press 1 for Rock, 2 for Paper, 3 for Scissors : ");
        // Taking input from the user
        int userInput = sc.nextInt();
        // Let the computer generate a random number
        Random comp = new Random();
        int computerInput = comp.nextInt(3);
        System.out.println("Computer entered : " + computerInput);

        // Case 1 - Draw
        if (userInput == computerInput) {
            System.out.println("It is a Draw ");
            // winning condition for the user
        } else if ((userInput == 1 && computerInput == 3) || (userInput == 3 && computerInput == 2)
                || (userInput == 2 && computerInput == 1)) {
            System.out.println("User wins");
            // winning condition for the computer
        } else if ((computerInput == 1 && userInput == 3) || (computerInput == 3 && userInput == 2)
                || (computerInput == 2 && userInput == 1)) {
            System.out.println("computer wins");
        } else {
            System.out.println("Enter Valid input");
        }
        System.out.println("Thanks for playing the game");
    }
}
