import java.util.Scanner;

class HumanPlayer extends Player{	
	
	public HumanPlayer(String name, char mark) {
		this.name = name;
		this.mark = mark;
	}
	
	//does part
	void makeMove()
	{
		Scanner scan = new Scanner(System.in);
		int row, col;
		do {
			//Take input from the user/player
			System.out.print("Enter the row and column :");
			row = scan.nextInt();
			col = scan.nextInt();
			
			//Check whether the input is a valid move or not
			//As long as the player is making an invalid moves, we should keep on give them another chance until they make a valid move
			//The movement they make a valid move, we should just place it and stop
		} while (!isValidMove(row, col));
		
		//It is a valid move so place it
		TicTacToe.placeMark(row, col, mark);		
//		scan.close();		
	}
		
}
