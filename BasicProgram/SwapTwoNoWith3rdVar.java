package BasicProgram;

import java.util.Scanner;

public class SwapTwoNoWith3rdVar
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
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap ");
		System.out.println("A is "+a);
		System.out.println("B is "+b);
	}
}
