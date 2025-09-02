package StringProgram;

import java.util.Scanner;

public class RemoveVowelsFromString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		str=str.replaceAll("[AEIOUaeiou]","");
		System.out.println("String without vowel are ");
		System.out.println(str);
	}
}
