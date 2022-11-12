package abstraction;

public class ScheduledReports extends TestReports {

	public ScheduledReports() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void deleteReport() {
		// TODO Auto-generated method stub
		System.out.println("Delete Scheduled Test Report");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//absReport can call deleteReport method as it's given in AbstractReport calls.
		//however the implementation is given in ScheduledReports class. the output fr
		AbstractReport absReport = new ScheduledReports();
		absReport.deleteReport();
		
		AbstractReport absReport1 = new TestReports();
		absReport1.deleteReport();
		absReport1.runReport();   //local version of runReport implementation is called.
		
		ScheduledReports absReport3 = new ScheduledReports();
		absReport3.deleteReport();
		
	}

}
