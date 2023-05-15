import java.sql.*;

public class JDBCService {
    Connection conn = null;

    PreparedStatement preparedStatement;
    final String URL = "jdbc:mysql://localhost/assignment";
    final String username= "root";
    final String password = "password";
    final String clazzName = "com.mysql.cj.jdbc.Driver";

    Connection connection() throws ClassNotFoundException, SQLException {
        Class.forName(clazzName);
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(URL, username, password);
        return conn;
    }


    public void insertCommand(Long idNumber, String lastName, String firstName,
                              String contactNumber, String emailAddress, String postalAddress,
                              int employeeId, String employeeTitle) throws SQLException, ClassNotFoundException {


        String insertPerson = "INSERT INTO Person(idNumber, lastname, firstname) values(?, ?, ?)";
        PreparedStatement st = connection().prepareStatement(insertPerson);

        // saving person ..
        Person person = new Person(idNumber, lastName, firstName);
        st.setLong(1, person.getIdNumber());
        st.setString(2, person.getLastName());
        st.setString(3, person.getFirstName());
        st.execute();

        // saving contacts ..
        Contacts contacts = new Contacts(contactNumber, emailAddress, postalAddress);
        String insertContact = "INSERT INTO Contacts(contactNo, email, address) values(?, ?, ?)";
        PreparedStatement st1 = connection().prepareStatement(insertContact);
        st1.setString(1, contacts.getContactNo());
        st1.setString(2, contacts.getEmail());
        st1.setString(3, contacts.getAddress());
        st1.execute();

        // saving employee ..
        Employee employee = new Employee(employeeId, employeeTitle);
        String insertEmployee = "INSERT INTO Employee(employeeId, employeeTitle) values(?, ?)";
        PreparedStatement st2 = connection().prepareStatement(insertEmployee);
        st2.setInt(1, employee.getEmployeeId());
        st2.setString(2, employee.getEmployeeRole());
        st2.execute();
    }

}