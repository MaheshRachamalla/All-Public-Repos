
abstract class Player {
	//has part
	String name;
	char mark;
	
	abstract void makeMove();
	
	boolean isValidMove(int row, int col)
	{
		//Checking whether the row and column are within the boundary or not
		if((0 <= row && row <= 2) && (0 <= col && col <= 2)) {
			if(TicTacToe.board[row][col] == ' ') {
				return true; // It is a valid move 
			}
		}
		return false; // It is invalid move
	}
	
}
