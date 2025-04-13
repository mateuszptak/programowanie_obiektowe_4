// --------  Czym sa atrybuty i metody w klasach

// Atrybuty są to konkretne cechy opisujace klase czyli: kolor, marka, rok produkcji itp itd
// Medoty to funkcje ktore moze wykonywac dany obiekt czyli: info(), start(), stop()
public class Zadanie2 {
    public static void main(String[] args) {
        // Tworz obiekt
        Car auto = new Car();

        // Ustawia atrybuty czyli cechy tego konkretnego auta
        auto.brand = "Toyota";
        auto.color = "Grey";
        auto.numberOfDoors = 5;

        auto.drive(); // Wywołuje metode drive() z obiektu auto
        auto.stop(); // Wywołuje metode stop() z obiektu auto
        auto.info();
    }

}

class Car {
    // Atrybuty (inaczej pola)
    String brand;
    String color;
    int numberOfDoors;

    // Metoda – co obiekt potrafi zrobić
    void drive() {
        System.out.println(brand + " jedzie!");
    }

    void stop() {
        System.out.println(brand + " Zatrzymuje się.");
    }

    void info() {
        System.out.println("Marka: " + brand);
        System.out.println("Kolor: " + color);
        System.out.println("Liczba drzwi: " + numberOfDoors);
    }
}