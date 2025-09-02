package BasicProgram;

import java.util.Scanner;

public class AsciiValueOfChar
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char ");
		char ch=sc.next().charAt(0);
		int value=ch;
		System.out.println("Ascii of value char is " +ch+ " is " +value);
	}
}
