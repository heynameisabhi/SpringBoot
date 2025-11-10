package pkg1.Entity;

public class Student {
    private int id;
    private String name;
    private int age;

    // Constructors
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
}
