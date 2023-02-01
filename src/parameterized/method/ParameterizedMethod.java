package parameterized.method;

public class ParameterizedMethod {

	public static void main(String[] args) {
		ParameterizedMethod obj = new ParameterizedMethod();
		obj.ss();
		sampleMethod(22,23);
		sampleMethod(100,200);
		obj.substractionMethod(23.23f, 24);
		obj.sampleM("how are you");
		

	}
	
	public void ss() 
	{
		int a= 90;
		int b= 88;
		int c= a+b;
		System.out.println("ss method");
	}
	
	public static void sampleMethod(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition is = "+c);
		System.out.println("Sample Method");
	}
	
	public void substractionMethod(float a, int b)
	{
		int d =88;
		float c = a- b+d;
		
	System.out.println("Substraction is ="+c);
		
	}
	
	public void sampleM(String str)
	{
		String dd = "hello "+ str;
		System.out.println(dd);
	}

}
