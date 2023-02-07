package Assignement_1;
import java.util.Arrays;
import java.util.*;

public class Board {
//has 1 attribute the board
	private String [][] board;
	private ArrayList<int[]> snakes;
	private ArrayList<int[]> ladders;

//default constructor that generates the board 10 by 10	
	public Board() {
		String [][] board = new String[10][10]; 
		int a  = 100;
		for (int i=0; i<10; i++) { 
			if (i%2==0) { 
				for (int j = 0; j<10; j++) {
					board[i][j] = Integer.toString(a--);}}
			else { 
				for (int j = 0; j<10; j++){
					board[i][9-j] = Integer.toString(a--);}}
		}
		this.board = board;
		this.snakes = new ArrayList<int[]>();
		this.ladders = new ArrayList<int[]>();
	}
// could write a constructer that sates random snakes and ladders
	
	
//method that convert a 1-100 position to a int [][]
	
	public int [] convertPosition(int position){
		int [] positionArr = new int [2];
		positionArr[0] = 9 - position/10; 
		if (positionArr[0] %2 ==0) 
			positionArr[1] = 10 - position%10;
		else 
			positionArr[1] = position%10-1;
		return positionArr;
		
	}
//getter gets the character stored in the particular position on the board
	public String getBoardPiece(int position){
		int [] positionArr = convertPosition(position);
		return board[positionArr[0]][positionArr[1]];
	}
	
//getter that takes in a position and returns the coordinates of a snake that crosses that position 
	
//getter that takes in a position and returns thee coordinates of a ladder that crosses that position
	
//setter takes the int position and the value to store AS A STRING and sets the character stored in the particular position on the board
	public void setBoardPiece(int position, String a) {
		int [] positionArr = convertPosition(position);
		this.board[positionArr[0]][positionArr[1]] = a;
	}
//!!!!!!!!!! correct for the last row to be the same length as the others 
	
	
// setter that takes in an array of int positions snake, adds it to the array list snakes 
// and builds a snake on the board with it 
// the snake that we take in is an array of positions
// I need to first convert it in a 2d posArr and then loop thru it to set the positions to S	
	public void setSnake (int [] snake) {
		this.snakes.add(Arrays.copyOf(snake, snake.length));
		for (int i = 0; i<snake.length; i++) {
		setBoardPiece(snake[i], "S");	
		}
	}
	
//same setter for ladder 
	public void setLadder (int [] ladder) {
		this.ladders.add(Arrays.copyOf(ladder, ladder.length));
		for (int i = 0; i<ladder.length; i++) {
		setBoardPiece(ladder[i], "L");	
		}
	}
	
	
	
	
		
//not quiet a toString, it print the board as you call the method		
		public void printBoard() {
			System.out.println("------------------------------------------------------------------------------");
			for (int i = 0; i<10; i++) {
				System.out.println(Arrays.toString(board[i]).replace("],","|\n").replace(",","\t|"));//.replaceAll("[\\[\\]]", "|"));
				System.out.println("------------------------------------------------------------------------------");
			}}

//snakes toString 
		public String snakesToString() {
			String snakesStr = new String("");
			for (int i = 0; i<this.snakes.size();i++ ) {
				snakesStr+=("\n" + (i+1) +": ");
				for (int j = 0; j<this.snakes.get(i).length; j++) {
					snakesStr = snakesStr + this.snakes.get(i)[j] + " ";
				}
			}
		return "And the snakes are..." + snakesStr;
		}
		
//ladders toString 
		public String laddersToString() {
			String laddersStr = new String("");
			for (int i = 0; i<this.ladders.size();i++ ) {
				laddersStr+=("\n" + (i+1) +": ");
				for (int j = 0; j<this.ladders.get(i).length; j++) {
					laddersStr = laddersStr + this.ladders.get(i)[j] + " ";
				}
			}
		return "And the ladders are..." + laddersStr;
		}

	
}

