package interfaceinjava;

public interface reserveBank {
	public final static int abc=77;
	
	public abstract void savingAccountCharges();
	
	public abstract void currentAccountCharges();
	public abstract int m();
	
	public default void sampleImplementedMethod()
	{
		System.out.println("this is default method from interface");
	}
	
	public static void staticMethodFromInterface()
	{
		System.out.println("this is static method from interface");
	}
}
