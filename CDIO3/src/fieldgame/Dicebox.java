package fieldgame;

public class Dicebox {
	
	//Dice t1;
	//Dice t2;
	int numberOfDice = 2;
	Dice[] box  = new Dice[numberOfDice];
	
	public Dicebox(){
	this.box[0] = new Dice(); 
	this.box[1] = new Dice(); 
	}

	public int getDice(int dicenumber) {
		return box[dicenumber].getDice();
	}
	
	public void setDice(int dicenumber, int new_dicevalue) {
		box[dicenumber].setDice(new_dicevalue);
	}
	
	public int getDiceside(int dicenumber) {
		return box[dicenumber].getDiceside();
	}
	
	public void rollDice(){
		box[0].rollDice();
		box[1].rollDice();
	}
	
	public int getSum() {
		return (box[0].getDice() + box[1].getDice());
	}
	
	public void setDiceside(int dicenumber, int new_diceside){
		box[dicenumber].setDiceside(new_diceside);
	}

	public String toString() {
		return ("The dicebox has the values " + box[0].getDice() + " and " + box[1].getDice());
	}
}