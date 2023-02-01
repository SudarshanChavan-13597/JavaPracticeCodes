package operators;

public class ShiftOperator {

	public static void main(String[] args) {
		// Shift Operators
				//   <<,>>
		int a = 5; // 0000 0000 0000 0000 0000 0000 0000 0101
        int b = 7; // 0000 0000 0000 0000 0000 0000 0000 0111
        
        int c= a<<3; //0 0000 0000 0000 0000 0000 0000 0101000 // 3%32 = 3
        System.out.println(c);
        
        int d = b>>2;// 00000 0000 0000 0000 0000 0000 0000 011
        System.out.println(d);// b/2^2
        
        
        
        
		
	}

}
