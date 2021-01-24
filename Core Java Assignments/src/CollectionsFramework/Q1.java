package CollectionsFramework;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private int weight;
    private double height;
    private String name;

    public Person(int weight, double height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }
    
    public double getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Two Employees are equal if their weights are equal
    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return weight == person.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    // Compare person based on their weights
    @Override
    public int compareTo(Person person) {
        return this.getWeight() - person.getWeight();
    }
    
    

    @Override
    public String toString() {
        return "Person{" +
                "weight= " + weight +
                ", height="+ height +
                ", name='" + name + '\'' +
                '}';
    }
}


public class Q1 {
    public static void main(String[] args) {
        // Creating a TreeSet of User Defined Objects.

        /*
           The requirement for a TreeSet of user defined objects is that

           1. Either the class should implement the Comparable interface and provide
              the implementation for the compareTo() function.
           2. Or you should provide a custom Comparator while creating the TreeSet.
        */

        SortedSet<Person> person = new TreeSet<>();

        // TreeSet uses the compareTo() method of the 
        // person class to compare two people and sort them based on weight then height
        person.add(new Person(170, 5.6, "Rajeev"));
        person.add(new Person(110, 5.7, "Sachin"));
        person.add(new Person(240, 6.1, "Chris"));
        person.add(new Person(300, 6.1, "Mark"));

        System.out.println("People (sorted based on Employee class's compareTo() function)");
        System.out.println(person);

    }
}