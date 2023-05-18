package Lab2;

import java.util.Scanner;

public class Task1 {
		
	public static void main(String[] args)
	{
		
		try
		{
			//get input
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a nonnegative integer: ");
			int n = input.nextInt();
			//if input is nonnegative
			if(n>0 || n==0)
			{
				//end message
				System.out.println("The sum of all integers from 0 to " + n + " is " + addIntegers(n));
			}
			//if input is negative
			else
			{
				System.out.println("That is not a nonnegative integer!");
			}
		}
		catch(Exception ex)
		{
			System.out.println("That is not a nonnegative integer!");
		}
		
	}
	public static int addIntegers(int n) {
		//base case
		if (n == 0)
		{
			return 0;
		}
		//every other case
		else
		{
			//add to itself
			return n + addIntegers(n-1);
		}
}
}