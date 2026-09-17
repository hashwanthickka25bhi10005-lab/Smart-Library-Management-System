class Librarian extends User {
    private String employeeId;

    public Librarian(int id, String name, String employeeId) {
        super(id, name);
        this.employeeId = employeeId;
    }

    public void addBook(Book book) {
        System.out.println("Librarian added: " + book.getTitle());
    }

    public void displayUser() {
        System.out.println("Librarian ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Employee ID: " + employeeId);
    }
}