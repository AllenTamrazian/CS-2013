package Lab2;

import java.util.Scanner;

public class Task5 {
		 /** Main method */
	 public static int count = 0;
	 public static void main(String[] args) {
	
	 // Create a Scanner
	 Scanner input = new Scanner(System.in);
	 System.out.print("Enter an index for a Fibonacci number: ");
	 int index = input.nextInt();
	// Find and display the Fibonacci number
	System.out.println("The Fibonacci number at index "+ index + " is " + fib(index));
	System.out.println("The fib() method was called "
			+ count + (count == 1 ? " time." : " times."));
	 }
	 /** The method for finding the Fibonacci number */
	public static long fib(long index) {
		count++;
		if (index == 0)
		{
			return 0;
		}
		else if (index == 1)
		{
			return 1;
		}
		else
		{
			return fib(index - 1) + fib(index - 2);
		}
	}
	}