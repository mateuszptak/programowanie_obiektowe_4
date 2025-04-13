// ----- Atrybut pochodnych -----
// To nie jest zwykła zahardkodowana wartość, tylko zmienna liczy się na podstawie innych zmiennych.
// Czyli ten atrybut nie jest zapisany na stałe, zawsze liczy sie na bieżąco

class Person {
    String name;
    String surname;

    String getFullName() {
        return name + " " + surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}

public class Zadanie8 {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski");
        System.out.println("Imię: " + person.name);
        System.out.println("Nazwisko: " + person.surname);
        System.out.println("Pełne nazwisko: " + person.getFullName());
    }
}
