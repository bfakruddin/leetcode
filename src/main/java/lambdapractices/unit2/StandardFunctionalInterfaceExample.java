package lambdapractices.unit2;

import lambdapractices.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfaceExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Baba", "Dudekula", 39),
                new Person("Raju", "Datla", 38),
                new Person("Manoj", "Govikari", 39)
        );

        // Step - 1 Sort list by last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step - 2 Create a method that prints all elements in the list
        System.out.println("************  Printing All Persons   ************");
        performConditionally(people, p -> true, p -> System.out.println(p));

        // Step - 3 Create a method that prints all people that have last name starts with D
        System.out.println("************  Printing All Persons last name start with D  ************");
        performConditionally(people, (p1) -> p1.getLastName().startsWith("D"), p -> System.out.println(p.getLastName()));
    }

    // Predicate is abstract method which avoids creating explicit interfaces to code lambda expressions with no arguments and return boolean
    // Java 8 providing multiple Interfaces which can be leveraged for lambda expression coding
    // Consumer is abstract method which accepts the object with no return type
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> personConsumer) {
        for (Person p: people) {
            if (predicate.test(p)){
                personConsumer.accept(p);
            }
        }
    }
}
