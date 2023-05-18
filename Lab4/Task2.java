/*Allen Tamrazian
 * Lab 4
 * This code checks if a performs the operations on a string in Postfix notation using Stacks.
 * */
package Lab4;

import java.util.Stack;

public class Task2 {
	public static void main(String[] args)
	{
		String expression = "1 2 + 3 *";
		expression=expression.replaceAll(" ", "");
		System.out.println(expression);
		Stack<String> operationStack = new Stack<>();
		for(int i=0; i<expression.length();i++)
		{
			operationStack.push(expression.substring(i,i+1));
			System.out.println(operationStack);
			if(operationStack.get(i).equals("+"))
			{
				operationStack.pop();
				int firstNumber=Integer.parseInt(operationStack.pop());
				int secondNumber=Integer.parseInt(operationStack.pop());
				operationStack.push(String.valueOf(firstNumber+secondNumber));
				System.out.println(operationStack);
			}
		}
		System.out.print(operationStack);
		

	}
}
