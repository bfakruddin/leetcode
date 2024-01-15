package lambdapractices.unit3;

import com.sun.security.jgss.GSSUtil;
import lambdapractices.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Baba", "Dudekula", 39),
                new Person("Raju", "Datla", 38),
                new Person("Manoj", "Govikari", 39)
        );

        people.stream()
                .filter(p -> p.getLastName().startsWith("D") )
                .forEach(p -> System.out.println(p.getFirstName()));

        int count = (int) people.stream()
                .filter(p -> p.getLastName().startsWith("D"))
                .count();

        System.out.println(count);
    }
}
