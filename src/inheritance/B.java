package inheritance;

public class B extends A{
	int b = 990;
	static int stb = 880;
	
		

		public void nonStaticMethodFromB() {
			System.out.println("thos is non static method from B");
		}

		public static void staticMethodFromB()
		{
			System.out.println("thos is static method from B");

		}
		public static void main(String[] args) 
		{
			A.sta=55;
			A.staticMethodFromA();
			
			B.stb=550;
			B.staticMethodFromA();
			B.staticMethodFromB();
			B.sta=55;
			
			A aObj = new A();
			aObj.a=11;
			aObj.sta=45;
			aObj.staticMethodFromA();
			aObj.nonStaticMethodFromA();
			
			B bObj =new B();
			bObj.a=11;
			bObj.b=111;
			bObj.sta=44;
			bObj.stb=440;
			bObj.nonStaticMethodFromA();
			bObj.nonStaticMethodFromB();
			bObj.staticMethodFromA();
			bObj.staticMethodFromB();
			
			
	}

}
