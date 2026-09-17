import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        System.out.println("======================================");
        System.out.println("     SMART LIBRARY MANAGEMENT SYSTEM");
        System.out.println("======================================");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Welcome, " + name + "!");

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        User user = new User(1, name, age);

        System.out.println("Member Category: " + user.getCategory());

        // Adding books
        library.addBook(new Book(101, "Java Programming",
                "James Gosling", "Programming"));

        library.addBook(new Book(102, "Database Systems",
                "Raghu Ramakrishnan", "Database"));

        library.addBook(new Book(103, "Computer Networks",
                "Andrew Tanenbaum", "Networking"));

        library.addBook(new Book(104, "Artificial Intelligence",
                "Stuart Russell", "AI"));

        int choice;

        do {
            System.out.println("\n1. View Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book");
            System.out.println("5. Show User Details");
            System.out.println("6. Database Structure");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        library.displayBooks();
                        break;

                    case 2:
                        System.out.print("Enter Book ID: ");
                        int borrowId = sc.nextInt();
                        library.borrowBook(borrowId, user);
                        break;

                    case 3:
                        System.out.print("Enter Book ID: ");
                        int returnId = sc.nextInt();
                        library.returnBook(returnId);
                        break;

                    case 4:
                        sc.nextLine();
                        System.out.print("Enter title to search: ");
                        String title = sc.nextLine();
                        library.searchBook(title);
                        break;

                    case 5:
                        user.displayDetails();
                        break;

                    case 6:
                        DatabaseManager.showJDBCStructure();
                        break;

                    case 7:
                        System.out.println("Thank you for using Smart Library!");
                        break;

                    default:
                        System.out.println("Invalid choice.");

                }

            } catch (LibraryException e) {
                System.out.println("Library Error: " + e.getMessage());
            }
        } while (choice != 7);

        sc.close();
    }
}