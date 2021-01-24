package CollectionsFramework;
//Java code to demonstrate LinkedHashSet is ordered

import java.util.*; 

public class LinkedHashSetQ2 
{ 
 public static void main(String[] args) 
 { 
 	Set<String> lhs = new LinkedHashSet<String>(); 

     lhs.add("1"); 
     lhs.add("7"); 
     lhs.add("Akshay"); 
     lhs.add("Capgemini"); 
     lhs.add("Software"); 
     lhs.add("14"); 

     // Iterating though the LinkedHashSet 
     Iterator<String> itr = lhs.iterator(); 
     while (itr.hasNext()) 
         System.out.print(itr.next() + ", "); 
     
     //EXPLANATION: As you can see the values 
     //were printed in the order they were added 
     //showing a LinkedHashSet is ordered
 } 
}