package chapter14_Java_Test_Automaton;

import java.util.Scanner;

public class CoinTossGame {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		CoinTossGame game = new CoinTossGame();
		Player player1 = new Player(game.askPlayerName());
		player1.setGuess(game.askGuess());

		Player player2 = new Player(game.askPlayerName());

		if (player1.getGuess().equalsIgnoreCase(Coin.HEADS)) {
			player2.setGuess(Coin.TAILS);
		} else {
			player2.setGuess(Coin.HEADS);
		}
		System.out.println("Flipping the coin.....");
		Coin coin = new Coin();
		coin.flip();
		System.out.println("The coin landed on " + coin.getSide());

		game.determineWinner(player1, player2, coin);
		game.scanner.close();

	}

	private void determineWinner(Player player1, Player player2, Coin coin) {
		String winner;
		if (coin.getSide().equalsIgnoreCase(player1.getGuess())) {
			winner = player1.getName();
		} else {
			winner = player2.getName();
		}
		System.out.println(String.format("The winner is %s", winner));
	}

	private String askPlayerName() {
		System.out.println("Enter the Player's name: ");
		return scanner.nextLine();
	}

	private String askGuess() {
		System.out.println("Enter Heads or Tails:");
		String guess = scanner.nextLine();
		while (!guess.equalsIgnoreCase(Coin.HEADS) && !guess.equalsIgnoreCase(Coin.TAILS)) {
			System.out.println("Invalid guss. Try again- Heads or Tails:");
			guess = scanner.nextLine();
		}
		return guess;

	}

}
