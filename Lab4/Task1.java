/*Allen Tamrazian
 * Lab 4
 * This code checks if a String has pairs of grouping symbols using Stacks.
 * */
package Lab4;

import java.util.Stack;

public class Task1 {
	public static void main(String[] args) {
		String expression="({1+2})";
		Stack<String> operationStack = new Stack<>();
		//add only the symbols to the stack
		for(int i=0; i<expression.length();i++)
		{
			if(expression.substring(i,i+1).equals("{") || expression.substring(i,i+1).equals("(")|| expression.substring(i,i+1).equals("["))
			{
				operationStack.push(expression.substring(i,i+1));
			}
			if(expression.substring(i,i+1).equals("}") || expression.substring(i,i+1).equals(")")|| expression.substring(i,i+1).equals("]"))
			{
				operationStack.push(expression.substring(i,i+1));
			}
		}
		//go through each pair
		for(int i=0; i<operationStack.size()/2;i++)
		{
			//remove pairs if they are equal
			if(operationStack.firstElement().equals("(") && operationStack.peek().equals(")"))
			{
				operationStack.pop();
				operationStack.remove(operationStack.firstElement());
			}
			else if(operationStack.firstElement().equals("{") && operationStack.peek().equals("}"))
			{
				operationStack.pop();
				operationStack.remove(operationStack.firstElement());
			}
			else if(operationStack.firstElement().equals("[") && operationStack.peek().equals("]"))
			{
				operationStack.pop();
				operationStack.remove(operationStack.firstElement());
			}
			//if the pairs are not equal
			else
			{
				System.out.println("The Java source-code does not have correct pairs.");
				System.exit(1);
			}
			System.out.println("The Java source-code has correct pairs.");
		}
		
		
		
	}
}
