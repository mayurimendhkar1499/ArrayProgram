package ArratProgram;

import java.util.Scanner;

public class MaxReapeative
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values in array ");
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
		
		int maxcount=0;
		int element=0;
		System.out.println("Max Repeative values are ");
		for(int i=0; i<a.length; i++)
		{
			int count=1;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(maxcount < count)
			{
				maxcount=count;
				element=a[i];
			}
		}
		System.out.println(element +" ----> "+ maxcount);
	}
}
