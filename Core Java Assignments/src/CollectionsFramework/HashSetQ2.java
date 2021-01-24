package CollectionsFramework;
//Prove that HashSet is unordered
import java.util.*;  

public class HashSetQ2
{  
	public static void main(String args[])
	{  
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("1");    
		set.add("5");    
		set.add("4");   
		set.add("2");  
		set.add("3"); 
  
		Iterator<String> i=set.iterator();
		while(i.hasNext())  
		{
			System.out.println(i.next());  
		}
		//EXPLANATION: As you can see the HashSet did not print the items
		//in the order they were stored proving the HashSet is unordered
  }  
}  