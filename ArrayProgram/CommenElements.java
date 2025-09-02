package ArratProgram;

import java.util.Scanner;

public class CommenElements 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values in 1st array ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[size];
		System.out.println("Enter the values in 2nd array ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("Commen elements are ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
