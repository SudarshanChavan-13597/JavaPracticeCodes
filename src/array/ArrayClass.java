package array;

import java.util.Arrays;

public class ArrayClass {
	
	

	public static void main(String[] args) {
		
		int a= 89;
		int b= 89;
		boolean c= a==b;
		System.out.println(c);
		
		
		int[] arr = {23, 20, 21, 30};
		
		int[] arr1 = {23, 20, 21, 30};
		System.out.print("{");
		
		for(int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("}");
		
		boolean ab = arr == arr1;
		System.out.println(ab);
		System.out.println(arr);
		
		boolean ab1 = Arrays.equals(arr, arr1);
		System.out.println(ab1);
		
		Arrays.sort(arr1);
		int s = arr[0];
		int d = arr1[0];
		System.out.println(s);
		System.out.println(d);
		
		int ss = arr.length;
		System.out.println(ss);
		
		ArrayClass obj = new ArrayClass();
		System.out.println(obj);
		
		
		int arr2 [] = new int[3]; // to create new array
		
		arr2[0]= 1;
		arr2[1]=2;
		arr2[3]=3;
	

	}

}
