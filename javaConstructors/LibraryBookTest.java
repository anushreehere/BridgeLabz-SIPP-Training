class LibraryBook {
    String title;
    String author;
    double price;
    boolean isAvailable;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println(title + " is already borrowed!");
        }
    }

    void display() {
        System.out.println("Book: " + title + ", Author: " + author +
                ", Price: $" + price + ", Available: " + isAvailable);
    }
}

public class LibraryBookTest {
    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("OOP Concepts", "John", 199.99);
        b.display();
        b.borrowBook();
        b.borrowBook(); // trying to borrow again
        b.display();
    }
}
