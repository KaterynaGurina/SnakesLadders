package Assignement_1;

public class Player {
	private String name;
	private int turn = 0;
	private int diceRoll = 0;
	private int position = 0;
	private static int numPlayers = 1; //when the num players reaches 2 either display a message that this game shouldnt have more then 2 players or stop the call completely 
	
//default constructor 
	public Player() {
		this.name = "Player "+ numPlayers;
		this.turn = 0;
		this.diceRoll = 0;
		this.position = 0;
		numPlayers++; 
//!!!!!!!!!!not sure if this crap with a static variable will work!!!!!!!!!
		}
	
//parameterised constructer
	public Player(String name) {
		
		this.name = name;
		this.turn = 0;
		this.diceRoll = 0;
		this.position = 0;
		numPlayers++;
		}
	
//getter	
	public String getName() {
		return name;}
	public int getTurn() {
		return turn;}
	public int getPosition() {
		return position;}
	
//setter	
	public void setName(String name) {
		this.name = name;}
	public void setTurn(int turn) {
		this.turn = turn;}
	public void setPosition(int position) {
		this.position = position;}
	
//toString
	public String toString() {
		return "Player "+ this.name + " made " + turn + " turns and is now at position " + position;}
	
//method that flips the dice	
	public int flipDice() {
		return (int)(Math.random()*6)+1;
	}
	
	
//method that makes a move on the board	
	public void move () {
		
	}


}
