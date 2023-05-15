import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    private static void menu() {
        System.out.println("***Database Management System***"
                + "\n Please enter the following details");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        JDBCService service = new JDBCService();

        menu(); //menu for the service title

        Scanner sc = new Scanner(System.in);

        System.out.print("Your id number: ");
        Long idNumber = Long.valueOf(sc.next());
        System.out.print("Your lastname: ");
        String lastName = sc.next();
        System.out.print("Your firstname: ");
        String firstName = sc.next();
        System.out.print("Your contact number: ");
        String contactNumber = sc.next();
        System.out.print("Your email address: ");
        String emailAddress = sc.next();
        System.out.print("Your postal address: ");
        String postalAddress = sc.next();
        System.out.print("Your employee id: ");
        int employeeId = Integer.parseInt(sc.next());
        System.out.print("Your employee title: ");
        String employeeTitle = sc.next();

        try {
            service.insertCommand(idNumber, lastName, firstName, contactNumber, emailAddress, postalAddress, employeeId,
                    employeeTitle);
            System.out.println("Saving details to the database...");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}