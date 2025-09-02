package ArratProgram;

import java.util.Scanner;

public class EvenOddCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values in array ");
		int a[]=new int[7];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int ecount=0;
		int ocount=0;
		System.out.println("Even values are ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				ecount++;
			}
		}
		System.out.println("Even values count are "+ecount);
		
		System.out.println("Odd values are ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
				ocount++;
			}
		}
		System.out.println("Odd values count are "+ocount);
		
	}
}
