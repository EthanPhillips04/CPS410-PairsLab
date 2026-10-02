import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scnr;
		Random rand = new Random();

		System.out.println("Welcome to the Guessing Game! Guess a number between 1 and 1000!");
		
		//local variables
		int guess = -1;
		int num = 0;
		
		//generate a random number between 1 and 1000
		while((num % 2) != 1) {
			num = rand.nextInt(1, 1001);
		}
		int numberOfGuesses = 0;
		while(guess != num) { //run while the guess input does not equal the generated number
			scnr = new Scanner(System.in);
			//run a try statement to catch non number inputs
			try {
				numberOfGuesses++; //track the number of times the user has guessed
				System.out.print("You're guess: ");
				guess = scnr.nextInt();
			} catch (Exception e) {
				//if the input isn't a number, retract the guess and continue to the next iteration
				numberOfGuesses--;
				guess = -1;
				System.out.println("That's not a number. Try again.");
				continue;
			}
			
			//print if the guess is higher or lower than the generated number
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
