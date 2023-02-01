package ifstatements;

public class NestedIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 4;
		int b= 88;
		
		if (a>20)
		{
			System.out.println("Inside outer If");
		
			{if (b<20)
			
				System.out.println("Inside inner If");
				
				else
				{
					System.out.println("Inside inner else");
				}
			}
		}
		
		else
		{
			System.out.println("Inside Outer else");
			if (b<20)
			{
				System.out.println("inside inner if");
			}
			else
			{
				System.out.println("inside inner else");
			}
				
		}
	}

}
