package lambdapractices.unit1;

import lambdapractices.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Baba", "Dudekula", 39),
                new Person("Raju", "Datla", 38),
                new Person("Manoj", "Govikari", 39)
        );

        // Step - 1 Sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return  (o1.getLastName().compareTo(o2.getLastName()));
            }
        });

        // Step - 2 Create a method that prints all elements in the list
        System.out.println("************  Printing All Persons   ************");
        printAll(people);


        // Step - 3 Create a method that prints all people that have last name starts with D
        System.out.println("************  Printing All Persons last name start with D  ************");
        printConditionally(people, new Condition(){
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("D");
            }
        });

    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p: people) {
            if (condition.test(p)){
                System.out.println(p.toString());
            }
        }
    }

    private static void printAll(List<Person> people) {
        for(Person person: people){
            System.out.println(person.toString());
        }
    }


}


interface Condition{
    boolean test(Person p);
}