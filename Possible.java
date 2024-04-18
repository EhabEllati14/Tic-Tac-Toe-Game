package application;

public class Possible {
	private int row;
	private int col;
	private String stat;
	
	Possible(int row,int col, String stat){
		this.row=row;
		this.col=col;
		this.stat=stat;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	public String getStat() {
		return stat;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}
	
}
