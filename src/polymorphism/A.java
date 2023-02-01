package polymorphism;

public class A {
	int abc = 99;
	static int stABC = 88;
	int pqr = 77;
	static int stPQR = 66;

	public void nonstaticMethod() {
		System.out.println("this non static method from A");
		int c = 4 + 4;
		System.out.println(c);
	}
	
	public static void staticMethod()
	{
		System.out.println("this is static method from A");
	}
	
	public void sm()
	{
		System.out.println("sm from A");
	}
	
	public static void smStatic()
	{
		System.out.println("sm Static from A");
	}

}
