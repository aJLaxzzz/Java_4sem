package TaskTwo;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = List.of(
                new Human(25, "John", "Doe", LocalDate.of(1997, 5, 15), 70),
                new Human(18, "Alice", "Smith", LocalDate.of(2004, 8, 20), 55),
                new Human(30, "Bob", "Johnson", LocalDate.of(1992, 2, 10), 80),
                new Human(22, "Eve", "Taylor", LocalDate.of(2000, 11, 5), 65)
        );

        List<Human> sortedByAge = humans.stream()
                .sorted((h1, h2) -> Integer.compare(h1.getAge(), h2.getAge()))
                .toList();
        System.out.println("Отсортировано по возрасту:");
        sortedByAge.forEach(System.out::println);

        System.out.println();

        List<Human> filterAgeLess20 = humans.stream()
                .filter(human -> human.getAge()<20)
                .toList();
        System.out.println("Фильтр - возраст меньше 20:");
        filterAgeLess20.forEach(System.out::println);

        System.out.println();

        List<Human> filterNameGetE = humans.stream()
                .filter(human -> human.getFirstName().toLowerCase().contains("e"))
                .toList();
        System.out.println("Фильтр - в имени есть буква Е:");
        filterNameGetE.forEach(System.out::println);

        System.out.println();

        String concatenatedInitials = humans.stream()
                .map(human -> String.valueOf(human.getFirstName().charAt(0)))
                .collect(Collectors.joining(", "));
        System.out.println("Конкатенация первых букв имен: " + concatenatedInitials);
    }
}
