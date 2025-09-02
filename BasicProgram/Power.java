package BasicProgram;

import java.util.Scanner;

public class Power
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and index ");
		int base=sc.nextInt();
		int index=sc.nextInt();
		int power=1;
		for(int i=1; i<=index; i++)
		{
			power=power*base; 
		}
		System.out.println("Power is "+power);
	}
}
