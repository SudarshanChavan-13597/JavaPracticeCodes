package objectclss;

public class Student {
	int rollNumber;
	String name;
	char division;
	boolean male;

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.studentReadsBooks();

		st1.rollNumber = 1;
		st1.name = "amit";
		st1.male = true;
		System.out.println(st1.name);

		studentParticipateInSinging();

	}

	public void studentReadsBooks() {
		System.out.println("student Reads English Book");
	}

	public static void studentParticipateInSinging() {
		System.out.println("student Participate In Singing");
	}
}
