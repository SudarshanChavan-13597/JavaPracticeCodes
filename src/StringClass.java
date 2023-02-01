
public class StringClass {

	public static void main(String[] args) {
		
		String str1= "wlecome";//using literal constant
		String str2= new String ("welcome"); //using new keyword
		String str3= "wlecome";
		String str4= new String ("wlecome");
		String str5= new String("wlecome to");
		String str6= "welcome to";
		
		boolean f1= str1==str2;
		System.out.println(f1);
		boolean f2= str1==str3;
		System.out.println(f2);
		boolean f3= str2==str4;
		System.out.println(f3);
		
		boolean f4= str1.equals(str4);
		System.out.println(f4);
		
	}

}
