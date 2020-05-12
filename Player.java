import java.util.Scanner;

/**
 * holds information about each Player and runs the game after it has already been started.
 * @author Nicholas Lee
 *
 */
public class Player {
	protected String name;
	protected Board board;
	protected Player opponent;
	protected char mark;
	
	/**
	 * Default constructor that sets everything to a value of insignificance
	 */
	public Player() {
		name = "no name";
		board = new Board();
		opponent = null;
		mark = 'z';
	}
	
	/**
	 * constructor that set name of player and the mark they will use
	 * @param playername, the name of the player
	 * @param playermark, the value of the Players mark
	 */
	public Player(String playername, char playermark){
		name = playername;
		mark = playermark;
	}
	
	/**
	 * sets the opponent of the player
	 * @param player, what opponent will be equal to
	 */
	public void setOpponent(Player player) {
		opponent = player;
	}
	
	/**
	 * After the game has started, keeps the game going until it has finished.
	 */
	public void play() {
		if(!board.xWins() && !board.oWins() && !board.isFull()) {
			makeMove();
		}
		if(board.xWins()) {
			board.display();
			if(mark == 'X')
				System.out.println("The game is over, and the winner is " + name + "!");
			else
				System.out.println("The game is over, and the winner is " + opponent.name + "!");
		}
		else if(board.oWins()) {
			board.display();
			if(mark == 'O')
				System.out.println("The game is over, and the winner is " + name + "!");
			else
				System.out.println("The game is over, and the winner is " + opponent.name + "!");
		}
		else if(board.isFull()) {
			board.display();
			System.out.println("The game is over, and it ends in a tie.");
		}
		else {
			board.display();
			opponent.play();
		}
	}
	
	/**
	 * instructs user to make next move and gets the input, then adds their input to the game board
	 * by calling methods needed.
	 */
	public void makeMove() {
		Scanner scan = new Scanner(System.in);
		System.out.println(name + "'s turn!");
		System.out.println("enter the row of where you want to place " + mark);
		int row = scan.nextInt();
		System.out.println("enter the column of where you want to place " + mark);
		int col = scan.nextInt();
		board.addMark(row, col, mark);
	}
	
	/**
	 * sets the board of the player.
	 * @param theBoard, what board will be set to.
	 */
	public void setBoard(Board theBoard) {
		board = theBoard; 
	}
	
	public Board getBoard() {
		return board;
	}

}
