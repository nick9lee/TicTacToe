
public class BlockingPlayer extends RandomPlayer{
	public BlockingPlayer(String playername, char playermark) {
		super(playername, playermark);
	}
	
	public void makeMove() {
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				if(testForBlocking(i,j)) {
					board.addMark(i, j, mark);
					return;
				}
			}
		}
		
		super.makeMove();
	}
	
	protected boolean testForBlocking(int row, int col) {
		if(board.getMark(row, col) == ' ') {
			board.addMark(row, col, opponent.mark);
			if(opponent.mark == 'X') {
				if(board.xWins()) {
					board.addMark(row, col, ' ');
					return true;
				}
			}
			
			if(opponent.mark == 'O') {
				if(board.oWins()) {
					board.addMark(row, col, ' ');
					return true;
				}
			}
			
			board.addMark(row, col, ' ');
			return false;
		}
		return false;
		
	}

}
