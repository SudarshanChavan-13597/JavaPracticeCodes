package constructor;

public class Student {
	
	int rollNum;
	String name;
	char div;
	
	public Student()
	{
		System.out.println("this is default constructor");
	}
	
	public Student(int a, char ch)
	{
		rollNum=a;
		div=ch;
		System.out.println(rollNum+div);
	}
	
	public Student(String st)
	{
		name=st;
	}
	
	public Student(String ss, int b, char c)
	{
		name=ss;
		rollNum=b;
		div=c;
		System.out.println(name+rollNum+div);
	}

	public static void main(String[] args) {
		
		Student obj = new Student();
		Student obj1 = new Student(56, 'A');
		Student obj2 = new Student ("Sudarshan Chavan");
		Student obj3 = new Student ("Sudarshan Chavan", 56, 'A');
		

	}

}
