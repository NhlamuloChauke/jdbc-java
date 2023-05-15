public class Contacts {

    private String contactNo;
    private String email;
    private String address;

    public Contacts(){}

    public Contacts(String contactNo, String email, String address) {
        this.contactNo = contactNo;
        this.email = email;
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
