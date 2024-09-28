public class Student {

    private String fullName;
    private String email;

    // default constructor
    public Student() {
        this.fullName = "";
        this.email = "";
    }

    public Student(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    // getters and setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // override
    @Override
    public String toString() {
        return "Full name is: " + fullName + "\nEmail is: " + email;
    }
}