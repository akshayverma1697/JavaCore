package LambdaExpressions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;
 
public class Q6 
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("a", "k", "s", "h", "a", "y"));
        
        System.out.println("list before using unary operator: ");
        System.out.println(myList);
         
        myList.replaceAll( new Op1() );  
        
        System.out.println("-----------------------------"); 

        System.out.println("list after using unary operator: "); 
        System.out.println(myList);
    }
}
 
class Op1 implements UnaryOperator<String> 
{
    @Override
    public String apply(String t) {
        return t.toUpperCase();
    }
}