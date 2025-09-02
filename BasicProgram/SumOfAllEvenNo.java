package BasicProgram;

import java.util.Scanner;

public class SumOfAllEvenNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit ");
		int no=sc.nextInt();
		System.out.println("Even no list are ");
		int sum=0;
		for(int i=1; i<=no; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("Sum of all even are "+sum);
	}
}
