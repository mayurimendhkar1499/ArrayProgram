package ArratProgram;

import java.util.Scanner;

public class MinMax2ndLargestValue 
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
		//Descending sort 
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			
		System.out.println("Maximum value are ---> ");
		int max=a[0];
		System.out.println("Max value are "+max);
		
		System.out.println();
		System.out.println("Minimum values are ---> ");
		int min=a[a.length-1];
		System.out.println("Min value are "+min);
		
		System.out.println();
		System.out.println("Enter the position ");
		int pos=sc.nextInt();
		int value=pos-1;
		System.out.println(pos + "---->" +a[value]);
	}
}
