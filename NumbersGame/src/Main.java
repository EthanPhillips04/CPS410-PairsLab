import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
		Random rand = new Random();

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Guess an odd number between 1 and 1000:");
        int guess = scnr.nextInt();

        if(guess % 2 == 0 || guess < 1 || guess > 1000) {
            System.out.println("Invalid guess. Please enter an odd number between 1 and 1000.");
            return;
        }

		int num = 0;
		while((num % 2) != 1) {
			num = rand.nextInt(1, 1001);
		}

        while(guess != num) {

            if(guess < num) {
                System.out.println("The number is higher.");
            } else {
                System.out.println("The number is lower.");
            }

            System.out.println("Sorry, you didn't guess the number. Try again:");
            guess = scnr.nextInt();
        }

        if(guess == num) {
            System.out.println("You guessed the number! The number was " + num);
        }

	}

}
