// Notka dla mnie:
// Przeciazenie (Overloading) tworzy wiele metod o tej samej nazwie ale z roznymi parametrami - inny typ, liczba, string itd. Wykonuja podobne operacje ale sa dostosowane do roznych typow danych.

// zalety? Mam jedna nazwe metody np. sell() ale rozne wersje ktore sa bardziej elastyczne i dostosowane do roznych sytuacji.

class Piekarnia {
    // Metoda do sprzedaży jednego bochenka chleba
    public void sprzedaj(String chleb) {
        System.out.println("Sprzedaję jeden bochenek " + chleb + " za 5 zł.");
    }

    // Metoda do sprzedaży określonej liczby bochenków tego samego rodzaju
    public void sprzedaj(String chleb, int ilosc) {
        System.out.println("Sprzedaję " + ilosc + " bochenków " + chleb + " za " + (ilosc * 5) + " zł.");
    }

    // Metoda do sprzedaży różnych rodzajów pieczywa
    public void sprzedaj(String chleb, String bułki) {
        System.out.println("Sprzedaję bochenek chleba " + chleb + " i bułki " + bułki + " za 10 zł.");
    }
}

public class Zadanie6 {
    public static void main(String[] args) {
        Piekarnia piekarnia = new Piekarnia();
        piekarnia.sprzedaj("Żytni"); // sprzedaz jednego bochenka
        piekarnia.sprzedaj("Razowy", 17); // sprzedaz 17 takich samych bochenkow
        piekarnia.sprzedaj("Pszenny", "Kajzerkai"); // sprzedaz roznych rodzajow pieczywa
    }
}
