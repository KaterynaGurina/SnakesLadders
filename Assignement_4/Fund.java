package Assignement_4;
//I tried
public class Fund {
	//SET THE FIELDS
		private int loonies; 
		private int toonies;
		private int fiveBill;
		private int tenBill;
		private int twentyBill;
		
	//CONSTRUCTOR
		public Fund(int loonies, int toonies, int fiveBill, int tenBill, int twentyBill){
			this.loonies = loonies; 
			this.toonies = toonies;
			this.fiveBill = fiveBill;
			this.tenBill = tenBill;
			this.twentyBill = twentyBill;
		}
		
	//COPY CONSTRUCTOR
		public Fund(Fund source) {
			this.loonies = source.loonies;
			this.toonies = source.toonies;
			this.fiveBill = source.fiveBill;
			this.tenBill = source.tenBill;
			this.twentyBill = source.twentyBill;
			}
		
	//Getter OR Accessor
		public int getLoonies(){
			return loonies;}
		public  int getToonies(){
			return toonies;}
		public int getFiveBill() {
			return fiveBill;}
		public int getTenBill() {
			return tenBill;}
		public int getTwentyBill() {
			return twentyBill;}
		
	//SETTER OR Mutator
		public void setLoonies(int Loonies) {
			this.loonies = loonies;}
		public void setToonies(int Loonies) {
			this.toonies = toonies;}
		public void setFiveBill(int Loonies) {
			this.fiveBill = fiveBill;}
		public void setTenBill(int Loonies) {
			this.tenBill = tenBill;}
		public void setTwentyBill(int Loonies) {
			this.twentyBill = twentyBill;}
		
		//Driver
		/*public void drive() {
			System.out.println("\nYou bought a "+ this.color +" "+ this.make + ". Congrats!");//we can keep it as just color or this.color, now difference
			System.out.println("Please drive your car to the nearest exit and dont get lost.");
		}
		*/
		//to String method returns every single field in the current object that is being printed 
		/*public String toString() {//we overrode the original to string method that was defined for objects o the car class
	        return "Make: " + this.make + ".\n" 
	                +  "Price: " + this.price + ".\n"
	                +  "Year: " + this.year + ".\n"
	                +  "Color: " + this.color + ".\n"
	                +  "Parts: " + Arrays.toString(parts) + ".\n";}}
		*/
		public void addFund(int a, int b, int c, int d, int e) {
			this.loonies += a;
			this.toonies += b;
			this.fiveBill += c;
			this.tenBill += d;
			this.twentyBill += e;
		}
		public String toString() {
			 return "loonies: " + this.loonies + ".\n" 
		                +  "toonies: " + this.toonies + ".\n"
		                +  "fiveBill: " + this.fiveBill + ".\n"
		                +  "tenBill: " + this.tenBill + ".\n"
		                +  "twentyBill: " + this.twentyBill + ".\n";}
		}
		//public Boolean equals()

