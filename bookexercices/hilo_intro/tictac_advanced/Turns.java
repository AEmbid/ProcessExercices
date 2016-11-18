package tictac_advanced;

public class Turns {
	public boolean who;
	
	Turns (boolean n) {
		this.who = n;
	}
	
	void change() {
		if (this.who == true) {this.who = false;}
		else {this.who = true;}
		
	}
	
	boolean turn() {
		return who;
	}
	
}
