package LambdaExpressions;


interface Arithmatic
{
	int operations (int x, int y);
}

public class Q1 
{
	public static void main(String args[])
	{  
		Arithmatic add = (x, y) -> (x + y);
		Arithmatic subtract = (x, y) -> (x - y);
		Arithmatic divide = (x, y) -> (x / y);
		Arithmatic multiply = (x, y) -> (x * y);
		
		System.out.println("Add 200 and 10 = " + add.operations(200, 10));
		System.out.println("Subtract 200 and 10 = " + subtract.operations(200, 10));
		System.out.println("Divide 200 and 10 = " + divide.operations(200, 10));
		System.out.println("Multiply 200 and 10 = " + multiply.operations(200, 10));
	}
}
