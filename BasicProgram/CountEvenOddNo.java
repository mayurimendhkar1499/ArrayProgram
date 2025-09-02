package BasicProgram;

import java.util.Scanner;

public class CountEvenOddNo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int no=sc.nextInt();
		int evencount=0;
		int oddcount=0;
		while(no!=0)
		{
			//int rem=no%10;
			if(no%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			no=no/10;
		}
		System.out.println("Even no count is "+evencount);
		System.out.println("Odd no count is "+oddcount);
	}
}
