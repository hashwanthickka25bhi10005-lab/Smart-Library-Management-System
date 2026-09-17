import java.util.ArrayList;

public class Library implements LibraryTask {

    private ArrayList<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    @Override
    public void issueBook(int bookId) throws LibraryException {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (book.isIssued()) {
                    throw new LibraryException("Book is already issued.");
                }

                book.issue();
                System.out.println("Book issued successfully.");
                return;
            }
        }

        throw new LibraryException("Book not found.");
    }

    @Override
    public void returnBook(int bookId) throws LibraryException {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!book.isIssued()) {
                    throw new LibraryException("Book is not currently issued.");
                }

                book.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }

        throw new LibraryException("Book not found.");
    }

    @Override
    public void searchBook(String title) {
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found.");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
            System.out.println("--------------------");
        }
    }
}

interface LibraryTask {
    void addBook(Book book);
    void issueBook(int bookId) throws LibraryException;
    void returnBook(int bookId) throws LibraryException;
    void searchBook(String title);
}