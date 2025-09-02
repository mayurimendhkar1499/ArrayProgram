package StringProgram;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		String ch[]=str.split(" ");
		for(int i=0, j=ch.length-1; i<ch.length/2; i++, j--)
		{
			String temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
		}
		
	    System.out.println("After reverse ");
	    for(int i=0; i<ch.length; i++)
	    {
	    	System.out.printf(ch[i] + " ");
	    }
		
	}
}
