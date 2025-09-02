package BasicProgram;

import java.util.Scanner;

public class SwapTwoNoWithout3rdVar 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two no ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swap ");
		System.out.println("A is "+a);
		System.out.println("B is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap ");
		System.out.println("A is "+a);
		System.out.println("B is "+b);
	}
}
