package ifstatements;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks = 76;

		if (marks < 40) {
			System.out.println("you are fail");
		} else if (marks >= 40 && marks < 50) {
			System.out.println("You are passed with third class");
		} else if (marks > 50 && marks < 60) {
			System.out.println("you are passed with second class");
		} else if (marks > 60 && marks < 70) {
			System.out.println("you are passed with first class");
		} else if (marks > 70) {
			System.out.println("passed with distinction");
		} else {
			System.out.println("invalid marks");
		}

	}

}
