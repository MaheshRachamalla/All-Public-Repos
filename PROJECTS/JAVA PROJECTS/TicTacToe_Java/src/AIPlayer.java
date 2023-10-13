import java.util.Random;

class AIPlayer extends Player{

	public AIPlayer(String name, char mark) {
			this.name = name;
			this.mark = mark;
	}

	// does part
	void makeMove() 
	{
		int row, col;
		
		do 
		{
			//Generating some random number b/w 0 and 2
			Random r = new Random();
			row = r.nextInt(3);
			col = r.nextInt(3);
			
			// Check whether the input is a valid move or not
			// As long as the player is making an invalid moves, we should keep on give them
			// another chance until they make a valid move
			// The movement they make a valid move, we should just place it and stop
		} while (!isValidMove(row, col));

		// It is a valid move so place it
		TicTacToe.placeMark(row, col, mark);		
	}

}
