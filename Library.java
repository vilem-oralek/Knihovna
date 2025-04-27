import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    // Konstruktor
    public Library() {
        books = new ArrayList<>();
    }

    // Přidání knihy
    public void addBook(Book book) {
        books.add(book);
    }

    // Zobrazení všech knih
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("Knihovna je prázdná.");
        } else {
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i+1) + ". " + books.get(i));
            }
        }
    }

    // Vypůjčení knihy podle indexu
    public void borrowBook(int index) {
        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (!book.isBorrowed()) {
                book.borrowBook();
                System.out.println("Vypůjčil jsi si: " + book.getTitle());
            } else {
                System.out.println("Kniha je už vypůjčena.");
            }
        } else {
            System.out.println("Neplatný výběr.");
        }
    }

    // Vrácení knihy podle indexu
    public void returnBook(int index) {
        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (book.isBorrowed()) {
                book.returnBook();
                System.out.println("Vrátil jsi: " + book.getTitle());
            } else {
                System.out.println("Tato kniha není vypůjčena.");
            }
        } else {
            System.out.println("Neplatný výběr.");
        }
    }
}