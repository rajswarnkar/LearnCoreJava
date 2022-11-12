package oopsMiscellaneous;

public class WrapperClass1 {

	private int j;
	public WrapperClass1() {
		// TODO Auto-generated constructor stub
	}

	public WrapperClass1(int j) {
		// TODO Auto-generated constructor stub
		this.j=j;
	}
	
	@Override
	public String toString() {  
	  return Integer.toString(j);  
	}  
}
