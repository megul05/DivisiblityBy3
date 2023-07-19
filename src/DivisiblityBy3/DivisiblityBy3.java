package DivisiblityBy3;

import java.util.*;

public class DivisiblityBy3 {
	
	public static int divisible(int[] arr)
	{
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3 ==0 && arr[i] != 0)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		int print = divisible(arr);
		System.out.println(print);
	}

}
