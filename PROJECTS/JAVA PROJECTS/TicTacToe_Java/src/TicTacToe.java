
class TicTacToe {
	static char[][] board;
	
	public TicTacToe() {
		//Creating the board with default null characters
		board = new char[3][3];
		//Initializing the board with space characters
		initBoard();
	}
	
	void initBoard()
	{
		for (int i = 0; i <= board.length-1; i++) {
			for (int j = 0; j <= board[i].length-1; j++) {
				board[i][j] = ' ';
			}			
		}
	}
	
	static void displayBoard()
	{
		System.out.println("-------------");
		for (int i = 0; i <= board.length-1; i++) {
			System.out.print("| ");
			for (int j = 0; j <= board[i].length-1; j++) {
				System.out.print(board[i][j]+ " | ");
			}			
			System.out.println();
			System.out.println("-------------");
		}	
		System.out.println("========================");
	}

	static void placeMark(int row, int col, char mark)
	{
		//Checking whether the row and column are valid or not?
		//if valid then simply place the mark
		//else prompt Invalid Position
		if((0 <= row && row <= 2) && (0 <= col && col <= 2)) {
			board[row][col] = mark;
		}
		else {
			System.out.println("Invalid Position");
		}
	}

	static boolean checkColWin()
	{
		//Checking for win condition for all columns 
		for (int j = 0; j <= board.length-1; j++) {
			//Check that the first character in each column is not empty
			if(board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
				return true; // return yes that you have won
			}			
		}
		return false; // return no that column wise nobody has won
	}

	static boolean checkRowWin()
	{
		//Checking for win condition for all rows 
		for (int i = 0; i <= board.length-1; i++) {
			//Check that the first character in each row is not empty
			if(board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true; // return yes that you have won
			}			
		}
		return false; // return no that row wise nobody has won
	}

	static boolean checkDiagWin() 
	{
		// Checking for win condition for both the diagonals
		//Also Check that the first character in each diagonal is not empty
		if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2] ||
				board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) 
		{
			return true; // return yes that you have won
		}
		return false; // return no that diagonal wise nobody has won
	}

	static boolean checkIsDraw()
	{
		for (int i = 0; i <= board.length-1; i++) {
			for (int j = 0; j <= board[i].length-1; j++) {
				if(board[i][j] == ' ') {
					return false; // No it is not a draw, still there is a place to make move
				}				
			}			
		}
		return true; // Yes it is a draw
	}

}
