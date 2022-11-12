package inheritanceInJava;

public interface InterfaceT {
	
	public static final String s="InterfaceT";
	
	public abstract void method1();
	
	public static void method2() {}
	
	default String method3()
	{		
		return s;
	}

}
