public class LaunchGame {
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		//Displaying the board for the first time i.e., empty board
		TicTacToe.displayBoard();
		
		HumanPlayer p1 = new HumanPlayer("Bob", 'X');
		AIPlayer p2 = new AIPlayer("AI", 'O');
//		HumanPlayer p2 = new HumanPlayer("Alice", 'O');
		
		//Since only one player is allowed to play at a time therefore,
		//Creating parent reference to keep track of the current player 
		//which is of type Player called cp i.e., CurrentPlayer
		Player cp;
		
		//reference type assignment
		//Since the first player has to make the first move
		cp = p1;
		
		while (true) {
			System.out.println(cp.name+ " turn");
			
			cp.makeMove();	
			TicTacToe.displayBoard();
			
			if(TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin())
			{
				System.out.println(cp.name+ " has won the game!");
				break;
			}else if (TicTacToe.checkIsDraw()) {
				System.out.println("Game is a Draw!");
				break;
			}
			else { // change the player
				if (cp == p1) {
					cp = p2;
				}else {
					cp = p1;
				}			
			}
		}	

//		System.out.println(t.checkColWin()); // Checking for Column Win
//		System.out.println(t.checkRowWin()); // Checking for Row Win
//		System.out.println(t.checkDiagWin()); // Checking for Diagonal Win
		
	}
}


//1) Creating the Board
//2) Initializing the board
//3) Displaying the board
//4) How can we place a mark(x,o)
//5) Every time when somebody places a mark, we have to also check whether or not that person has won the game or not.
//	 i.e., Write the logic to check for a win condition.
//	 How to check for a win?
//		Column wise win
//t.placeMark(0, 0, 'x');
//t.placeMark(1, 1, 'o');
//t.placeMark(2, 0, 'x');
//t.placeMark(0, 2, 'o');
//t.placeMark(1, 0, 'x');
//		Row wise win
//t.placeMark(0, 0, 'x');
//t.placeMark(1, 0, 'o');
//t.placeMark(0, 1, 'x');
//t.placeMark(1, 1, 'o');
//t.placeMark(0, 2, 'x');
//		Diagonal wise win
//t.placeMark(0, 0, 'x');
//t.placeMark(1, 1, 'x');
//t.placeMark(2, 2, 'x');
//6) Creating the Players
//		HumanPlayer and AIPlayer

