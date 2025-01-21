import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        List<Person> people = List.of(
            new Person("Gianmarco", Gender.MALE),
            new Person("Federica", Gender.FEMALE),
            new Person("Alessandro", Gender.MALE),
            new Person("Francesca", Gender.FEMALE),
            new Person("Givanni", Gender.MALE),
            new Person("Debora", Gender.FEMALE)
        );

        //Approccio imperativo
        // List<Person> female = new ArrayList<>();
        // for (Person person : people) {
        //     if (Gender.FEMALE.equals(person.gender)) female.add(person);
        // }

        // for (Person person : female) {
        //     System.out.println(person.name);
        // }

        //Approccio Dichiarativo
        //Filter viene chiamata intermediate operation
        people.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                        .collect(Collectors.toList())
                        .forEach(person -> System.out.println(person.name));

        System.out.println("Dopo la filter: \n");
        for (Person person : people) {
            System.out.println(person.name);
        }
    }
}
