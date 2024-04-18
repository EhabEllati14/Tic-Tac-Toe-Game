package application;

public class Square {
	
	private char value;
	private boolean visit;
	
	Square(char value,boolean visit){
	      this.value=value;
	      this.visit=visit;	
	}

	public char getValue() {
		return value;
	}

	public boolean isVisit() {
		return visit;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public void setVisit(boolean visit) {
		this.visit = visit;
	}
	

}
