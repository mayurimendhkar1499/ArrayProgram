package BasicProgram;

import java.util.Scanner;

public class PrimeNo1ToN
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the limit ");
		int no=sc.nextInt();
		System.out.println("Prime no list are ");
		int i,j;
		for(i=2; i<no; i++)
		{
			boolean flag=true;
			for(j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(i);
			}
		}
	}
}
