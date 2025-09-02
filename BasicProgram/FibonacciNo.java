package BasicProgram;

import java.util.Scanner;

public class FibonacciNo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit ");
		int no=sc.nextInt();
		int f1=0, f2=1, fib=0;
		System.out.println("Fibonacci Series are ");
		System.out.println(f1);
		System.out.println(f2);
		for(int i=1; i<=no; i++)
		{
			fib=f1+f2;
			f1=f2;
			f2=fib;
			System.out.println(fib);
		}
	}
}
