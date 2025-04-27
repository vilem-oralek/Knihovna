// Třída reprezentující Knihu
class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    // Konstruktor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    // Getter na název
    public String getTitle() {
        return title;
    }

    // Getter na vypůjčení
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Metoda na vypůjčení
    public void borrowBook() {
        isBorrowed = true;
    }

    // Metoda na vrácení
    public void returnBook() {
        isBorrowed = false;
    }

    @Override
    public String toString() {
        return title + " od " + author + (isBorrowed ? " (Vypůjčeno)" : " (Dostupné)");
    }
}