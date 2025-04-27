import java.util.Scanner;
// Hlavní třída
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Předpřidané knihy
        library.addBook(new Book("Hobit", "J.R.R. Tolkien"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Malý princ", "Antoine de Saint-Exupéry"));

        boolean running = true;

        System.out.println("Vítej v knihovně!");

        while (running) {
            System.out.println("\nVyber akci:");
            System.out.println("1 - Zobrazit knihy");
            System.out.println("2 - Vypůjčit knihu");
            System.out.println("3 - Vrátit knihu");
            System.out.println("4 - Přidat novou knihu");
            System.out.println("0 - Konec");

            System.out.print("Zadej volbu: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Ošetření Enteru

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    library.showBooks();
                    System.out.print("Zadej číslo knihy k vypůjčení: ");
                    int borrowIndex = scanner.nextInt() - 1;
                    library.borrowBook(borrowIndex);
                    break;
                case 3:
                    library.showBooks();
                    System.out.print("Zadej číslo knihy k vrácení: ");
                    int returnIndex = scanner.nextInt() - 1;
                    library.returnBook(returnIndex);
                    break;
                case 4:
                    System.out.print("Zadej název knihy: ");
                    String title = scanner.nextLine();
                    System.out.print("Zadej autora knihy: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    System.out.println("Kniha přidána!");
                    break;
                case 0:
                    running = false;
                    System.out.println("Ukončuji program. Nashledanou!");
                    break;
                default:
                    System.out.println("Neplatná volba.");
            }
        }

        scanner.close();
    }
}