
public class SnakeAndLadder {

	public static final int no_play = 0;
	public static final int ladder = 1;
	public static final int snake = 2;
	public static final int win = 100;

	public static void main(String[] args) {
		int player_position = 0;
                System.out.println("Welcome to Snake And Ladder Simulator.");

		while (player_position < win){

			int option = (int) Math.floor((Math.random() * 10) % 3);
			int roll_die = (int) Math.floor((Math.random() * 10) % 6) + 1;

			switch (option) {
			case no_play:
				player_position += 0;
				System.out.println("NO PLAY : You are at same position " + player_position);
				break;
			case ladder:
				player_position += roll_die;
				if (player_position > 100) {
					player_position -= roll_die;
					  System.out.println("LADDER: Your need only " + (100-player_position) + " to win");
					}
				else
				System.out.println("LADDER : You moved ahead by " + roll_die + ". Current Position is: " + player_position);
				break;
			case snake:
				player_position -= roll_die;
				System.out.println("SNAKE: You moved behind by " + roll_die + ". Current Position is: " + player_position);
				if (player_position <= 0) {
					player_position = 0;
					System.out.println("Current position of the player in the game is: " + player_position);
				}
				break;
			default:
				System.out.println("Error occured");
				break;
			}
		}
		System.out.println("You WIN at " + player_position);
	}
}
