public class Person {

    private Long idNumber;
    private String lastName;
    private String  firstName;
    private String gender;

    Person(){}
    public Person(Long idNumber, String lastName, String firstName) {
        this.idNumber = idNumber;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
