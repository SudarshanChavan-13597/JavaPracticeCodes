package inheritance;

public class A {
	int a = 99;
	static int sta = 88;

	public void nonStaticMethodFromA() {
		System.out.println("thos is non static method from A");
	}

	public static void staticMethodFromA()
	{
		System.out.println("thos is static method from A");

	}

	public static void main(String[] args) {
		A obj1 = new A();
		obj1.a=78;
		obj1.sta=56;
		obj1.nonStaticMethodFromA();
		obj1.staticMethodFromA();
		
		B bObj =new B();
		bObj.a=45;
		bObj.b=450;
		bObj.sta=44;
		bObj.stb=477;
		bObj.staticMethodFromA();
		bObj.staticMethodFromB();
		bObj.nonStaticMethodFromA();
		bObj.nonStaticMethodFromB();

	}

}
