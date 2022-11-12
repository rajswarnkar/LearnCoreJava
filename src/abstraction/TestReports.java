package abstraction;

public class TestReports extends AbstractReport {

	public TestReports() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void deleteReport() {
		// TODO Auto-generated method stub
		System.out.println("Delete Test Report");
	}
	
	@Override
	void runReport() {
		System.out.println("I am runReport method in TestReports.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
