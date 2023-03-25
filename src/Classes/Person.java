package Classes;

public class Person {
    private int number;
    private String name;
    private String password;

    public Person(int number, String name, String password) {
        this.number = number;
        this.name = name;
        this.password = password;
    }
    public Person(){

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Group{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
