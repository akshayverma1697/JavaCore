package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class predicateExampleForQ3 {

    public static void main(String[] args) {

        Predicate<Integer> biggerThan5 =  x -> x > 5;
        Predicate<Integer> lessThan10 = x -> x < 10;
        Predicate<Integer> even = x -> x % 2 == 0;
        
        List<Integer> list = Arrays.asList(1, 7, 20, 77, 14, 3, 2, 6);

        List<Integer> pTest1 = list.stream()
                .filter(biggerThan5)
                .collect(Collectors.toList());

        System.out.println(pTest1); // 7, 20, 77, 14, 6
        
        
        // multiple filters
        List<Integer> pTest2 = list.stream()
                .filter(x -> (x % 2 == 0) && (x < 10)).collect(Collectors.toList());

        System.out.println(pTest2); //2, 6

        //use Predicate.and()
        List<Integer> pTest3 = list.stream()
                .filter(biggerThan5.and(lessThan10).and(even))
                .collect(Collectors.toList());
        
        System.out.println(pTest3); // 6

    }

}