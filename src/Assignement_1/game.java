package Assignement_1;
import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		  Board game1 = new Board(); game1.setBoardPiece(1,"Kate"); int [] Arr =
		  {1,2,19,23}; game1.setSnake(Arr);
		  
		  int [] Arr1 = {3, 4, 5, 6, 7}; game1.setLadder(Arr1);
		  System.out.println(game1.snakesToString());
		  System.out.println(game1.laddersToString());
		  
		  game1.printBoard();
			/*
			 * Player playerOne = new Player();
			 * System.out.print("Enter the name of player ONE: "); playerOne.name = input
			 */
		
		
		 
		
	}

}
