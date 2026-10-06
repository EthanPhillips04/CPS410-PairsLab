@Test
public void testEvenGuessIsInvalid() {
GuessingGame game = new GuessingGame(101);

assertFalse(game.isValidGuess(500));
}

public boolean isValidGuess(int guess) {
  return guess >= 1 &&
         guess <= 1000 &&
         guess % 2 != 0;
}
