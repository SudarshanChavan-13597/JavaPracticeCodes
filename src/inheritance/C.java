package inheritance;

public class C extends B{
	
	int cc = 1233;
	static int stcc = 2342;
	
	public void nonStaticMethodFromC()
	{
		System.out.println("non Stati cMethod From C");
	}
	
	public static void staticMethodFromC()
	{
		System.out.println("Static Method From C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
