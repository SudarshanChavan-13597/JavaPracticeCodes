package thiskeyword;

public class ThisAsMethodPAram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 90;
		System.out.println("non static Method ");
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.b);
		staticMethod(this);
		sm(this);
	}

	public static void staticMethod(ThisAsMethodPAram ost) {
		System.out.println("static Method ");
		System.out.println(ost.a);

	}

	public void sm(ThisAsMethodPAram oo) {
		System.out.println("This is second nonstatic method");
		System.out.println(this.a);
		System.out.println(oo.a);

	}

}
