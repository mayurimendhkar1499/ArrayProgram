package BasicProgram;

import java.util.Scanner;

public class PrintAlternativeNo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int no=sc.nextInt();
		int rev=0 , rem, count=0, temp; 
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			rev=rev*10+rem;
			count++;
		}
		no=rev;
		temp=count;
		System.out.println("Alternative number are ");
		if(temp%2!=0)
		{
			while(no!=0)
			{
				rem=no%10;
				no=no/10;
				if(count%2!=0)
				{
					System.out.println(rem);
				}
				count--;
			}
		}
		else
		{
			while(no!=0)
			{
				rem=no%10;
				no=no/10;
				if(count%2==0)
				{
					System.out.println(rem);
				}
				count--;
			}
		}
	}
}
