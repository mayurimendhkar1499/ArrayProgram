package StringProgram;

import java.util.Scanner;

public class StringIsPalindromeOrNot 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		boolean flag=true;
		for(int i=0, j=ch.length-1; i<ch.length/2; i++,j--)
		{
			if(ch[i]!=ch[j])
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("String is palindrome ");
		}
		else
		{
			System.out.println("String is not palindrome ");
		}
	}

}
