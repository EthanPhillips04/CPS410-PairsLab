import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = 0;
		while(((num % 2) + 1) == 0) {
			num = rand.nextInt(1, 1000);
		}
	}

}
