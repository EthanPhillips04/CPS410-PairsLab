import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("Welcome to the Guessing Game! Guess a number between 1 and 1000!");
		int guess = -1;
		int num = 0;
		//generate a random number between 1 and 1000
		while((num % 2) != 1) {
			num = rand.nextInt(1, 1001);
		}
		int numberOfGuesses = 0;
		while(guess != num) { //run while the guess input does not equal the generated number
			//run a try statement to catch non number inputs
			try {
				numberOfGuesses++;
				System.out.print("You're guess: ");
				guess = scnr.nextInt();
			} catch (Exception e) {
				numberOfGuesses--;
				System.out.println("\nThat's not a number. Try again: ");
				continue;
			}
			//print if the guess is higher or lower than the guess
			if (guess > num){
				System.out.println("The number is lower.");
			} else {
				System.out.println("The number is higher.");
			}
		}
		System.out.println("You guessed it! The number was " + num);
		System.out.println("It took you " + numberOfGuesses + " times to guess. Lock in.");
		System.out.println("Thanks for playing!");
	}
	
}
