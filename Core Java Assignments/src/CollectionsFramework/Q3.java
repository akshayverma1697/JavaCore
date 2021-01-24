package CollectionsFramework;
//Use listIterator to print objects of an ArrayList backwards
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Q3
{
  public static void main (String[] args)
  {
      List<String> list = Arrays.asList(" Capgemini", " at", " team", " ACT", " the", " on", "I'm");

      // use ListIterator to iterate List in reverse order
      ListIterator<String> itr = list.listIterator(list.size());

      // hasPrevious() returns true if the list has previous element
      while (itr.hasPrevious()) {
          System.out.print(itr.previous());
      }
  }
}