package inheritance;

public class D extends A
	{
	int dd = 893455;
	static int stdd = 2334554;
	
	public void nonStaticMethodFromD()
	{
		System.out.println("non Stati cMethod From D");
	}
	
	public static void staticMethodFromD()
	{
		System.out.println("Static Method From D");
	}

	public static void main(String[] args)
	{
		D dObj =new D();
		
		System.out.println(dObj.a);
		System.out.println(dObj.dd);
		System.out.println(dObj.sta);
		System.out.println(dObj.stdd);
		dObj.staticMethodFromA();
		dObj.staticMethodFromD();
		dObj.nonStaticMethodFromA();
		dObj.nonStaticMethodFromD();



		
	}
}
