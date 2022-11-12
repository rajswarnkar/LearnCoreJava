
public class temp {

	public temp() {
		// TODO Auto-generated constructor stub
	}

	public static void main (String [] args) throws Exception {
		
		try {
			assert false;
			System.out.print("t ");
		}
		catch (Error e) {
			System.out.print("c ");
			throw new Exception();
			
		}
		finally {
			System.out.print("f");
		}
		
	}
}
