package objectclss;

public class HumanBeing {
	int height;
	String name = "KTCTC";
	float weight;
	

	public static void main(String[] args) {
		HumanBeing obj = new HumanBeing();
		HumanBeing obj2 = new HumanBeing();
		obj.humanBeingEats();
		

		obj.name = "Ganesh";
		obj.weight = 72.23f;
		obj.height = 169;
		
		System.out.println(obj.name);
		System.out.println(obj.weight);
		
		System.out.println(obj2.name);
		System.out.println(obj2.height);
		
		obj2.weight=obj.weight;
		System.out.println(obj.weight);
	
		obj2.humanBeingPlaySport();
	}
	

	public void humanBeingEats()
	{
		System.out.println("human Being Eats Pizza");
	}
	
	public void humanBeingPlaySport() {
		
		System.out.println("human Being Play Sports");
	}
	
}
