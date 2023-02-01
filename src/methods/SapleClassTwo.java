package methods;

public class SapleClassTwo {
	
	int abc= 77;
	char ch= 'D';
	
	public static void staticMethod()
	{
		int b= 90;
		System.out.println(b);
	}
	
	public void nonStaticMethod()
	{
		int c= 65;
		System.out.println(c);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticMethod();
		//SapleClassTwo.nonStaticMethod();
		

	}

}
