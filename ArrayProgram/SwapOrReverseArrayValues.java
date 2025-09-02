package ArratProgram;

import java.util.Scanner;

public class SwapOrReverseArrayValues
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
	      for(int i=0, j=a.length-1; i<a.length/2; i++,j--)
	      {
	    	  int temp=a[i];
	    	  a[i]=a[j];
	    	  a[j]=temp;
	      }
	      System.out.println("after reverse or swap ");
	      for(int i=0; i<a.length; i++)
	      {
	    	  System.out.println(a[i]);
	      }
	}
}
