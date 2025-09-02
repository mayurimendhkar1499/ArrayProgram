package BasicProgram;

import java.util.Scanner;

public class SwapFirstAndLastNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		int first,last;
		last=no%10;
		while(no>10)
		{
			no=no/10;
		}
		first=no;
		System.out.println("Before Swap ");
		System.out.println("First is "+first);
		System.out.println("Last is "+last);
		int temp=first;
		first=last;
		last=temp;
		System.out.println("After Swap ");
		System.out.println("First is "+first);
		System.out.println("Last is "+last);
	}
}
