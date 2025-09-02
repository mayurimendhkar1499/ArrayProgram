package BasicProgram;

import java.util.Scanner;

public class SumOfEachDigit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int no=sc.nextInt();
		int sum=0, rem;
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			sum=sum+rem;
		}
		System.out.println("Sum is each digit "+sum);
	}
}
