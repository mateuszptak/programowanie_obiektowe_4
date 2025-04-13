// Czym sie rozni metoda i atrybut od metody i atrybutu statycznego

// Atrybuty i metody statyczne są to atrybuty i metody, które są wspólne dla wszystkich obiektów danej klasy. Tak jakby odgornie przypisane do klasy

// Atrybuty i metody zwykle czyli niestatyczne sa przypisane do konkretnego obiektu danej klasy. Czyli metoda działa na tym konkretnym przykładzie

class Car {
    // Zwykłe atrybuty ktore beda definiowane w obiekcie
    String brand;
    String color;

    // Statyczny atrybut (należy do klasy)
    static final int wheelsNumber = 4;

    // Zwykła metoda
    void drive() {
        System.out.println(brand + " jedzie!");
    }
}

public class Zadanie3 {
    public static void main(String[] args) {
        // Wywołanie metody statycznej bez tworzenia obiektu
        System.out.println("Fun fakt: Samochody zazwyczaj mają " + Car.wheelsNumber + " koła.");

        // Tworzenie nowego obiektu
        Car auto = new Car();
        auto.brand = "Toyota";
        auto.color = "Grey";
        System.out.println("Marka: " + auto.brand);
        System.out.println("Kolor: " + auto.color);
    }
}
