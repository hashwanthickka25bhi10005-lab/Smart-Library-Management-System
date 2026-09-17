public class User {
    private int id;
    private String name;
    private int age;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCategory() {
        if (age < 18)
            return "Junior Member";
        else if (age < 60)
            return "Regular Member";
        else
            return "Senior Member";
    }

    public void displayDetails() {
        System.out.println("User ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Category: " + getCategory());
    }
}