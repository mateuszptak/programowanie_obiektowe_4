class Ksiazka {
    private String tytul;
    private String autor;
    private int rokWydania;

    public Ksiazka(String tytul, String autor, int rokWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }

    // Metoda porównująca dwa obiekty Ksiazka
    boolean czyJestIdentyczna(Ksiazka innaKsiazka) {
        // Jeżeli wszystkie pola są takie same, zwroci true
        return this.tytul.equals(innaKsiazka.tytul) &&
                this.autor.equals(innaKsiazka.autor) &&
                this.rokWydania == innaKsiazka.rokWydania;
    }

}

public class Zadanie9 {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Brudny Harry", "Phillip Rock", 1990);
        Ksiazka ksiazka2 = new Ksiazka("Brudny Harry", "Phillip Rock", 1990);
        Ksiazka ksiazka3 = new Ksiazka("Harry Potter", "J.K.Rowling", 1997);

        System.out.println(ksiazka1.czyJestIdentyczna(ksiazka2)); // output true
        System.out.println(ksiazka1.czyJestIdentyczna(ksiazka3)); // output false
    }
}
