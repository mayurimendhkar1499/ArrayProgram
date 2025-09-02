package BasicProgram;

import java.util.Scanner;


public class ArmstrongNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int no=sc.nextInt();
		int count=0,sum=0, rem;
		int temp=no;
		while(no!=0)
		{
			no=no/10;
			++count;
		}
		no=temp;
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			int p=1;
			for(int i=1; i<=count; i++)
			{
				p=p*rem;
			}
			sum=sum+p;
		}
		if(temp==sum)
		{
			System.out.println("Number is armstrong ");
		}
		else
		{
			System.out.println("Number is not armstrong ");
		}
	}
}
