public class Book {
    private int id;
    private String title;
    private String author;
    private String category;
    private boolean issued;

    public Book(int id, String title, String author, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.issued = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public boolean isIssued() {
        return issued;
    }

    public void issue() {
        issued = true;
    }

    public void returnBook() {
        issued = false;
    }

    public void displayBook() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Status: " + (issued ? "Issued" : "Available"));
    }
}