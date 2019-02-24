package domain;

public class User {

    private int id;
    private String firsName;
    private String lastName;
    private String email;

    public int getId() {
        return id;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public User(String firsName, String lastName, String email) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(int id, String firsName, String lastName, String email) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
    }

    public  String getFullName() {
        return firsName + " " + lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
