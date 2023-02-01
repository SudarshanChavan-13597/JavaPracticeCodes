package array;

import java.util.Arrays;

public class SortDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {23, 20, 21, 30};
		
		Arrays.sort(a);
		System.out.println("sorted array: ");
		
		for(int i=0; i<a.length; i++)
		
		{
			
			System.out.println(" "+a[i]);
		}
		for(int i=a.length-1; i>=0; i--)
			
		{
			
			System.out.println(" "+a[i]);
		}
	}

}
