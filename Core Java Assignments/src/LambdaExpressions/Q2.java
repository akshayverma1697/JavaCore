package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q2
{
	private String status;
	private int orderNum;	
	
	public String getstatus() {
		return status;
	}


	public void setstatus(String status) {
		this.status = status;
	}


	public int getorderNum() {
		return orderNum;
	}


	public void setorderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	
	public Q2(int orderNum, String status) 
	{
		super();
		this.orderNum = orderNum;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return orderNum + " " + status ;
	}
	
	public static void main(String[] args)
	{
		//TO DO: Figure out how to use these
		  //Predicate<Integer> orderNumCheck =  x -> x > 10000;	
		  //Predicate<String> orderStatusCheck = (x -> (x=="ACCEPTED" )||(x == "COMPLETED"));
		  
		  List<Q2> list1 = Arrays.asList(
				  new Q2(1, "ACCEPTED"),
				  new Q2(7, "COMPLETED"),
				  new Q2(20000, "COMPLETED"), 
				  new Q2(77000, "WORKING"),
				  new Q2(14, "UNCOMPLETE"),
				  new Q2(30000, "PENDING"),
				  new Q2(27000, "ACCEPTED"));
		  
		 List<Q2>sortedOrders= list1.stream()
				 .filter(f->f.getorderNum()>10000)
				 .filter(f->(f.getstatus()=="COMPLETED")||(f.getstatus()=="ACCEPTED"))
				 .collect(Collectors.toList());
		 sortedOrders.forEach(System.out::println);	 		  
	}
}
