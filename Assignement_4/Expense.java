package Assignement_4;
//I dont think i tmakes any sense at all 
public class Expense {
	private Fund[] funds;
	
		public Expense(Fund[] funds){
			this.funds = new Fund[funds.length];
			for (int i = 0; i < this.funds.length; i++ ) {
				this.funds[i] = new Fund(funds[i]);
		}
	}
		

}
