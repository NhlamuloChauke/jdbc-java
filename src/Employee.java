public class Employee {

    private int employeeId;
    private String employeeTitle;

    public Employee(){}

    public Employee(int employeeId, String employeeTitle) {
        this.employeeId = employeeId;
        this.employeeTitle = employeeTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeRole() {
        return employeeTitle;
    }

    public void setEmployeeRole(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }


}
