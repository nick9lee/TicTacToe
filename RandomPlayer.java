
public class RandomPlayer extends Player {
	
	protected RandomGenerator random;
	
	public RandomPlayer(String playername, char playermark) {
		super(playername, playermark);
	}
	
	public void play() {
		super.play();
	}
	
	public void makeMove() {
		random = new RandomGenerator(); 
		int i, j;
		while(true) {
			i = random.discrete(0, 2);
			j = random.discrete(0, 2);
			if(super.board.getMark(i, j) != 'O' && super.board.getMark(i, j) != 'X') {
				super.board.addMark(i, j, mark);
				break;
			}
		}
	}

}
