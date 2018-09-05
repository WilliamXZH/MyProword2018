package pers.zeky.test.thread;

public class IntegerWrapper {

	private int val;

	public IntegerWrapper(int val) {
		super();
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	public boolean equals(IntegerWrapper iw){
		return iw.getVal()==val;
	}
	
}
