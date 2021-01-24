package LambdaExpressions;
import java.util.ArrayList;

public class Q4
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("even");
		al.add("odd");
		al.add("akshay");
		al.add("capgemini");
		al.add("software");
		al.add("mazda");
		al.add("xbox");
		
		//count the number of characters in string
		//check the remainder when dividing by 2
		//if remainder equals 1 the string is odd
		//and should be removed
		al.removeIf(name -> name.length() % 2 == 1);
		
		System.out.println(al);
	}
}
