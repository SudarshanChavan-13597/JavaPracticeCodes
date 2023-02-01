package methods;

public class Runable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sapleMethodFromRunableClass();
		SampleClass.sampleMethod();

	}
	
	
	public static void sapleMethodFromRunableClass()
	{
		int abc= 55;
		System.out.println(abc);
		System.out.println("saple Method From Runable Class");
		
	}

	
	public void sampleNonStaticMethod()
	{
		char ch= 'c';
		System.out.println(ch);
		System.out.println("sample Non Static Method");
	}
}
