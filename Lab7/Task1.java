package Lab7;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

 
public class Task1 {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		int n = 10000000;
		Writer wr = new FileWriter("/Users/allentamrazian/eclipse-workspace/CS2013/jfx/src/Lab7/primes.txt", false);
		// A list to hold prime numbers
		java.util.List<Integer> list =new java.util.ArrayList<>();
		final int NUMBER_PER_LINE = 10; // Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness
		int squareRoot = 1; // Check whether number <= squareRoot
		// Repeatedly find prime numbers
		while (number <= n) {
			// Assume the number is prime
			boolean isPrime = true; // Is the current number prime?
				if (squareRoot * squareRoot < number) squareRoot++;
					// Test whether number is prime
				for (int k = 0; k < list.size()&& list.get(k) <= squareRoot; k++) {
					if (number % list.get(k) == 0) {  // If true, not prime
						isPrime = false; // Set isPrime to false
						break; // Exit the for loop
					}
				}
				// Print the prime number and increase the count
				if (isPrime) {
					count++; // Increase the count
					list.add(number); // Add a new prime to the list
					wr.write(String.valueOf(number));
					wr.write(" ");
				}
				if(number%n==0)
				{
					wr.write("\n");
					list.removeAll(list);
				}
				// Check whether the next number is prime
				number++;
				}
				System.out.println("");
				wr.close();
		}
		
}
