public class SnakeAndLadder {

	public static final int no_play = 0;
	public static final int ladder = 1;
	public static final int snake = 2;
	public static final int win = 100;

	public static void main(String[] args) {
		int player1_position = 0;
		int player2_position = 0;

		System.out.println("Welcome to Snake And Ladder Simulator.");

		while ((player1_position < win) || (player2_position < win)) {

			int option = (int) Math.floor((Math.random() * 10) % 3);
			int roll_die = (int) Math.floor((Math.random() * 10) % 6) + 1;

			switch (option) {
			case no_play:
				player1_position += 0;
				System.out.println("No Play: Player 1 position: " + player1_position);
				break;
			case ladder:
				player1_position += roll_die;
				if (player1_position > 100) {
					player1_position -= roll_die;
					System.out.println("Ladder: Player 1 position: " + player1_position);
				} else
					System.out.println("Ladder: Player 1 position: " + player1_position);
				if (player1_position == win) {
					System.out.println("Player 1 Wins");
					System.exit(1);
				}
				break;
			case snake:
				player1_position -= roll_die;

				if (player1_position < 0) {
					player1_position = 0;
					System.out.println("Snake: Player 1 position: " + player1_position);
				} else
					System.out.println("Snake: Player 1 position: " + player1_position);
				break;

			}

			option = (int) Math.floor((Math.random() * 10) % 3);
			roll_die = (int) Math.floor((Math.random() * 10) % 6) + 1;

			switch (option) {
			case no_play:
				player2_position += 0;
				System.out.println("No Play: Player 2 position: " + player2_position);
				break;
			case ladder:
				player2_position += roll_die;
				if (player2_position > 100) {
					player2_position -= roll_die;
					System.out.println("Ladder: Player 2 position: " + player2_position);
				} else
					System.out.println("Ladder: Player 2 position " + player2_position);
				if (player2_position == win) {
					System.out.println("Player2 Wins");
					System.exit(1);
				}
				break;
			case snake:
				player2_position -= roll_die;

				if (player2_position < 0) {
					player2_position = 0;
					System.out.println("Snake: Player 2 position: " + player2_position);
				} else
					System.out.println("Snake: Player 2 position: " + player2_position);
				;

			}

		}

	}
}
