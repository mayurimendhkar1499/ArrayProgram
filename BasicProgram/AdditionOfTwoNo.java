package BasicProgram;

import java.util.Scanner;

public class AdditionOfTwoNo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two no ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		sum=a+b;
		System.out.println("Sum of two no are "+sum);
	}
}
