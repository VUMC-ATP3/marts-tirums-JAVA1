package clasroomFive.pirmaisUzdevums;

public class Author {
    String Name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.Name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

