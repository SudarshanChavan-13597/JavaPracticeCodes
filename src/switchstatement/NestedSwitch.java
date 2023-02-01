package switchstatement;

public class NestedSwitch {

	public static void main(String[] args) {
		
		String str= "First year";
		int a= 2;
		
		switch(str) {
		
		case  "First year": 
			System.out.println("suraj");
			
			switch (a) {
			case 1:
				System.out.println("inside case 1");
				break;
				
			case 5:
				System.out.println("inside case 5");
				break;
				
			case 2:
				System.out.println("inside case 5");
				break;
				
			case 6:
				System.out.println("inside case 5");
				break;
				
				default:
					System.out.println("case is not matched");
					break;
			}
		case "Second year":
			System.out.println("Shashi");
			
		case "Third year" :
			System.out.println("Shivaji");
			
			default:
				System.out.println("no matching");
			
			
			
		}

	}

}
