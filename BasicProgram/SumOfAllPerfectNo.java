package BasicProgram;

import java.util.Scanner;

public class SumOfAllPerfectNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit ");
		int no=sc.nextInt();
		int i,j;
		int add=0;
		for(i=1; i<no; i++)
		{
			int sum=0;
			for(j=1; j<i; j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.println(i);
				add=add+i;
			}
		}
		System.out.println("Sum of all perfect no are "+add);
	}
}
