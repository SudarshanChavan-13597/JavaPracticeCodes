package parameterized.method;

public class ParameterizedMethod2 {
	static int abc = 89;
	int pqr = 90;

	public static void main(String[] args) 

	{ 	
		ParameterizedMethod2 obj = new ParameterizedMethod2();
		Student st = new Student();
		st.rollNo=11;
		st.name="Sid"; 
				
		sampleMethod(st);
		
		int z =99;
		ss(z);
		
		System.out.println(st.name);
		
		ss(abc);
		ss(obj.pqr);
	
		

	}

	public static void sampleMethod(Student obj)
	{
		System.out.println(obj.rollNo);
		System.out.println(obj.name);
		
		obj.rollNo= 55;
		obj.name = "KTCTC";
	}
	
	public static void ss (int a)
	{
		System.out.println(a);
	}
}
