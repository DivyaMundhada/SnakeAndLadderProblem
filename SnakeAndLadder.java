public class SnakeAndLadder {
public static void main(String[] args){
    System.out.println("Welcome to Snake And Ladder Simulator.");

    int player = 0;
    int roll_die = (int)Math.floor((Math.random() * 10) % 6) + 1;
    System.out.println("Rolled: " + roll_die);
}
}
