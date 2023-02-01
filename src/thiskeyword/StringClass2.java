package thiskeyword;

public class StringClass2 {

	public static void main(String[] args) {
		// charAt(), length(),endsWith(" "),startsWith(),replace(),split(" "),trim(),subString(),contains(),equals(),
		//concate(),equalsIgnoreCase(String another),toLowerCase(),toUpperCase()
		
		String str= "Welcome to KTCTC";
		String str2= "knowledge transfer";
		
		
		
		String str3= str.replace("KTCTC", str2);
		System.out.println(str3);
		
		String str1 = str.replace('T', '2');
		System.out.println(str1);
		
		boolean f2= str.startsWith("Welcome");
		System.out.println(f2);
		
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		
		for(int i=0; i<str.length(); i++)
		{
			System.out.print(str.charAt(i));
		}
		
		int lnt=str.length();
		System.out.println(lnt);
		
		char ch =str.charAt(9);
		System.out.println(ch);
		
		
	}

}
