package objects;

public class Athlete {

    public Athlete() {
    }

    public Athlete(int age, String gender, String name, String surname, String username, int height, int weight) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.height = height;
        this.weight = weight;
    }

    private int age;
    private String gender;
    private String name;
    private String surname;
    private String username;
    private double height;
    private double weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
