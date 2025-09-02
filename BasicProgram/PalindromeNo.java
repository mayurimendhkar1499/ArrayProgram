package BasicProgram;

import java.util.Scanner;

public class PalindromeNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int no=sc.nextInt();
		int rev=0, rem ,temp;
		temp=no;
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			rev=rev*10+rem;
		}
		if(temp==rev)
		{
			System.out.println("Number is palindrome ");
		}
		else
		{
			System.out.println("Number is not palindrome ");
		}
	}
}
