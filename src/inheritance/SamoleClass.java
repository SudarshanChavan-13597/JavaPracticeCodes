package inheritance;

public class SamoleClass {

	public static void main(String[] args) {

		A aa=new A();
		System.out.println(aa.a);
		System.out.println(aa.sta);
		aa.staticMethodFromA();
		aa.nonStaticMethodFromA();
		
		A ab=new B();
		ab.a=00;
		ab.sta=01;
		ab.staticMethodFromA();
		ab.nonStaticMethodFromA();
		
		A ac=new A();
		ac.a=11;
		ac.sta=12;
		ac.nonStaticMethodFromA();
		ac.staticMethodFromA();
		
		//B ba=new A();  cant resolved
		
		B ba = new B();
		ba.a=22;
		ba.b=21;
		ba.sta=23;
		ba.stb=24;
		ba.staticMethodFromA();
		ba.staticMethodFromB();
		ba.nonStaticMethodFromA();
		ba.nonStaticMethodFromB();
		
		B bc=new C();
		
		bc.a=33;
		bc.b=15;
		bc.sta=23;
		bc.stb=24;
		bc.staticMethodFromA();
		bc.staticMethodFromB();
		bc.nonStaticMethodFromA();
		bc.nonStaticMethodFromB();
		
		
	
		
	}

}
