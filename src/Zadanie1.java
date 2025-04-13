// ----- Roznica miedzy klasa, a obiektem -----

// Klasa:
// Klasa jest kolokwialnie mowiac szablonem na podstawie ktorego tworzymy obiekty np: 
// Klasa Auto która mówi nam o jego kolorze, marce itd.

// Obiekt: 
// Obiekt jest instancja klasy czyli jest to konkretne Auto ktore moge stworzyc na przykladzie klasy.

class Car {
    String brand;
    String color;
    int madeYear;

    void info() {
        System.out.println("Marka: " + brand);
        System.out.println("Kolor: " + color);
        System.out.println("Rok produkcji: " + madeYear);
    }
}

public class Zadanie1 {
    public static void main(String[] args) {
        // Tworze nowy obiekt uzywajac klasy Car
        Car myNewCar = new Car();
        myNewCar.brand = "Toyota";
        myNewCar.color = "Grey";
        myNewCar.madeYear = 2020;

        // Wywoluje funkcje info() z obiektu myNewCar
        myNewCar.info();
    }
}