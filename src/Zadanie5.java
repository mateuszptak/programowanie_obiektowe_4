// KOnstruktor jest to metoda w klasie ktora sluzy do inicjalizacji obiektu czyli ustawia początkowe wartosci jego atrybutow w momencie kiedy Tworze nowy obiekt danej klasy. Nazwa konstruktora musi byc identyczna jak nazwa klasy.

class Car {
    String brand;
    String color;

    // Konstruktor – ustawia początkowe wartości atrybutów
    public Car(String brand, String color) {
        this.brand = brand; // this.brand odnosi się do atrybutu klasy, a brand to parametr konstruktora
        this.color = color;
    }
}

public class Zadanie5 {
    public static void main(String[] args) {
        Car auto = new Car("Toyota", "Grey"); // Tworzenie obiektu z użyciem konstruktora
    }
}
