package BasicProgram;

import java.util.Scanner;

public class ProductOfEachDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int no=sc.nextInt();
		int product=1, rem;
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			product=product*rem;
		}
		System.out.println("Product is "+product);
	}
}
