package parameterized.method;

public class Student {
	int rollNo;
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.rollNo= 44;
		st.name = "ajay";
		st.displayStudentInfo();

	}
public void displayStudentInfo()
{
	System.out.println("Roll number ="+ rollNo);
	System.out.println("Name = "+ name);
}
}
