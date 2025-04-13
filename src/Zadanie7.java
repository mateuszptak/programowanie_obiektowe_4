import java.time.LocalDate;

class Book {
    static int bookReleaseDate(int releaseDate) {
        int currentYear = LocalDate.now().getYear(); // pobiera aktualny rok
        return currentYear - releaseDate; // oblicza wiek ksiazki
    }
}

public class Zadanie7 {
    public static void main(String[] args) {
        int bookAge = Book.bookReleaseDate(2000);
        int secondBookAge = Book.bookReleaseDate(1917);
        System.out.println("Książka ma tyle lat: " + bookAge); // output - "Książka ma tyle lat: 25"
        System.out.println("Książka ma tyle lat: " + secondBookAge); // output - "Książka ma tyle lat: 106"
    }
}
