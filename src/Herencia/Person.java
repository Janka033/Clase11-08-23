package Herencia;

public class Person {
    private int id;
    private String name;

    public Person() {
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Employee extends Person{
    public String position;

    public Employee(String position) {
        this.position = position;
    }

    public Employee(int id, String name, String position) {
        super(id, name);
        this.position = position;
    }
}