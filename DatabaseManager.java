public class DatabaseManager {

    public static void showJDBCstructure() {
        System.out.println("JDBC Database Structure");
        System.out.println("-----------------------");
        System.out.println("Database: LibraryDB");
        System.out.println("Table 1: Books");
        System.out.println("Columns: book_id, title, author, category, issued");
        System.out.println();
        System.out.println("Table 2: Users");
        System.out.println("Columns: user_id, name, age, category");
    }
}