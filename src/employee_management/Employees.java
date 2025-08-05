package employee_management;

public class Employees {
    private final int employeeId;
    private final String employeeName;

    public Employees(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return "Employees: "
                + "employeeId=" + employeeId
                + ", employeeName=" + employeeName;
    }
}
