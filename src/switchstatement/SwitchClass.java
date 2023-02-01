package switchstatement;

public class SwitchClass {

	public static void main(String[] args) {
		
		int a= 4;
		
		switch(a)
		{
		case 4:
			System.out.println(" inside case 4");
			break;
			
		case 1:
			System.out.println(" inside case 1");
			System.out.println(" inside case 1");
			break;
			
		case 2:
			System.out.println(" inside case 2");
			break;
			
		case 3:
			System.out.println(" inside case 3");
			break;
			
		
			
			default:
				System.out.println(" case not matched");
		}
		

	}

}
