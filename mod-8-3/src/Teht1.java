
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;
    private String city;

    // Konstruktori
    public Person(String name, int age, String city) {
        this.name = name;
        this.age  = age;
        this.city = city;
    }

    // Getterit (tarvitaan tulostukseen ja vertailuun)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    // Helppo tulostus
    @Override
    public String toString() {
        return name + " (" + age + ", " + city + ")";
    }
}

public class Teht1 {
    public static void main(String[] args) {
        // 2. Luodaan lista Person‑olioita
        List<Person> people = new ArrayList<>();
        people.add(new Person("Anna",   25, "Helsinki"));
        people.add(new Person("Matti",  32, "Tampere"));
        people.add(new Person("Liisa",  19, "Turku"));
        people.add(new Person("Pekka",  45, "Oulu"));
        people.add(new Person("Kaisa",  32, "Espoo"));

        System.out.println("Alkuperäinen lista:");
        people.forEach(p -> System.out.println(p));

        // sama käyttäen metodiin viitausoperaatiota ::
        // people.forEach(System.out::println);

        // 3. Järjestä iän mukaan nousevaan järjestykseen
        System.out.println("\nJärjestetty iän mukaan (nouseva):");
        //    Käytetään Comparator-rajapintaa ja lambda-lauseketta
        people.sort(Comparator.comparingInt(p -> p.getAge()));

        // sama käyttäen metodiin viitausoperaatiota ::
        // people.forEach(System.out::println);

    }
}
