package lambdapractices.unit3;

import lambdapractices.Person;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionsIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Baba", "Dudekula", 39),
                new Person("Raju", "Datla", 38),
                new Person("Manoj", "Govikari", 39)
        );

        // Ways to iterate the collections

        // Using For looop
        System.out.println("*************  For Loop   **************");
        for(int i=0; i<people.size(); i++){
            System.out.println(people.get(i).toString());
        }

        System.out.println("*************  For Each Loop   **************");
        for(Person p : people){
            System.out.println(p.toString());
        }

        System.out.println("*************  Using Iterator   **************");
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

        System.out.println("*************  Using Lambda For each   **************");
        people.forEach(System.out::println);

    }


}
