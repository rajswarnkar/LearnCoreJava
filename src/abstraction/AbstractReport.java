package abstraction;

public abstract class AbstractReport{
	
	void runReport() {
		System.out.println("I am runReport method in AbstractReport.");
	}
	
	void printReport() {
		System.out.println("I am printReport method in AbstractReport.");
	}
	abstract void deleteReport ();

}
