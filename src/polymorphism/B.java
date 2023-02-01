package polymorphism;

public class B extends A{
	int abc=999;
	static int stABC=888;
	
	public static void staticMethod()
	{
		System.out.println("thos is static method from ");
	}
	
	public void nonStaticMethod()
	{
		System.out.println("this is non static method from B");
		float c=41.5f+99;
		System.out.println(c);
	}

	public static void main(String[] args) {
		A ab=new B();
		System.out.println(ab.abc);
		System.out.println(ab.pqr);
		System.out.println(ab.stABC);
		System.out.println(ab.stPQR);
		ab.staticMethod();
		ab.nonstaticMethod();
		ab.sm();
		ab.smStatic();
		
		B bb=new B();
		System.out.println(bb.abc);
		System.out.println(bb.pqr);
		System.out.println(bb.stABC);
		System.out.println(bb.stPQR);
		bb.staticMethod();
		bb.nonstaticMethod();
		bb.sm();
		bb.smStatic();
		

		A aa = new A();
		System.out.println(aa.abc);
		System.out.println(aa.stABC);
		System.out.println(aa.pqr);
		aa.sm();
		aa.smStatic();
		aa.nonstaticMethod();
		aa.staticMethod();
		
	}

}
