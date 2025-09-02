package ArratProgram;

import java.util.Scanner;

public class SearchValue
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values in array ");
		int a[]=new int[6];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the value for search ");
		int value=sc.nextInt();
		boolean flag=false;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==value)
			{
				flag=true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Value is found ");
		}
		else
		{
			System.out.println("Value is not found ");
		}
	}
}
