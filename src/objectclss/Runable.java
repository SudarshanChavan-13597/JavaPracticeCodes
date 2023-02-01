package objectclss;

public class Runable {

	public static void main(String[] args) {
		Runable oo = new Runable();
		oo.sm();
		
		HumanBeing oo2 = new HumanBeing();
		oo2.height=45;
		oo2.name= "sanket";
		
		oo2.humanBeingEats();
		oo.ss();
		
		
	}

	public void sm()
	{
		System.out.println("This Method Is from Runable class");
	}
	
	public static void ss()
	{
		System.out.println("sss");
	}
}
