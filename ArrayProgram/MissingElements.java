package ArratProgram;

import java.util.Scanner;

public class MissingElements 
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
		//ascending order
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
		System.out.println("Missing values are ");
		int count=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i]!=a[j])
				{
					count++;
					if(count==a[i])
					{
						break;
					}
					else
					{
						System.out.println(count);
					}
				}
			}
		}		
	}
}
