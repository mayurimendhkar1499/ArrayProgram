package ArratProgram;

import java.util.Scanner;

public class DisplayDuplicateValue 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values in array ");
		int a[]=new int[5];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		boolean flag=false;
		System.out.println();
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					flag=true;
				}
			}
		}
		if(flag)
		{
			System.out.println("Duplicate elements found ");
		}
		else
		{
			System.out.println("Duplicate elements not found ");
		}
	}
}
