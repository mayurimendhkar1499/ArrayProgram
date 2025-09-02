package ArratProgram;

import java.util.Scanner;

public class RemoveDuplicate 
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
		//Ascending order 
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After remove duplicate ");
		int count=0;
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(a[i]);
			}
		}
		System.out.println(a[a.length-1]);
	}
}
