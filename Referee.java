/**
 * holds the information about both players and the state of the board game
 * @author Nicholas lee
 *
 */
public class Referee {
	private Player xPlayer;
	private Player yPlayer;
	private Board board;
	
	/**
	 * constructs object of type referee
	 * @param theboard is the value of board
	 * @param Playerx is the value of xPlayer
	 * @param Playery is the value of yPlayer
	 */
	public Referee(Board theboard,Player Playerx,Player Playery) { 
		xPlayer = Playerx;
		yPlayer = Playery;
		board = theboard;
	}
	
	/**
	 * constructs objects of type referee by calling instance objects default constructors
	 */
	public Referee() {
		xPlayer = new Player();
		yPlayer = new Player();
		board = new Board();
	}
	
	/**
	 * starts the first play of the game and tells Player objects who their opponent is
	 */
	public void runTheGame() {
		System.out.println("The Referee has started the game!");
		xPlayer.setOpponent(yPlayer);
		yPlayer.setOpponent(xPlayer);
		board.display();
		xPlayer.play();
	}
	
	/**
	 * initializes value of board.
	 * @param theboard, is what board will be equal to.
	 */
	public void setBoard(Board theboard) {
		board = theboard;
	}
	
	/**
	 * sets which player will use 'O'
	 * @param theplayer, what yPlayer will be set to
	 */
	public void setoPlayer(Player theplayer) {
		yPlayer = theplayer;
	}
	
	/**
	 * Sets which player will use 'X'
	 * @param theplayer, what xPlayer will be set too=.
	 */
	public void setxPlayer(Player theplayer) {
		xPlayer = theplayer;
	}
}
