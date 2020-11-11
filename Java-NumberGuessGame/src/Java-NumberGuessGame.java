import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class learningOne {
    public static void main(String[] args) { //methods
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctGuesses = 0;
        int incorrectGuesses = 0;

        while(true) {
            int randomInt = random.nextInt(100);
            int guess = scanner.nextInt();

            if (guess == randomInt) {
                correctGuesses += 1;
                System.out.println("The correct number is: " + randomInt + ".");
                System.out.println("You have successfully guessed the correct number!\nYou now have " + correctGuesses + " correct guesses.\nYou have got " + incorrectGuesses + " incorrect guesses.");
            } else {
                incorrectGuesses += 1;
                System.out.println("The correct number is: " + randomInt + ".");
                System.out.println("You have been unsuccessful in guessing the correct number!\nYou now have " + incorrectGuesses + " incorrect guesses.\nYou have got " + correctGuesses + " correct guesses.");
            }

            if (guess == 0) {
                break;
            }
        }
    }
}
