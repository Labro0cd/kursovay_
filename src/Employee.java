import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private int department;
    private int salary;
    private final int id;

    static int countId = 0;


    public Employee(String firstName, String middleName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        countId += 1;
        id = countId;
    }

    public String getFIO() {
        return firstName+" "+middleName+" "+lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee " + "id=" + id +" "+
                "FIO='" + getFIO() + '\'' +
                ", department: " + department +
                ", salary: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFIO(), department, salary, id);
    }

    public String toStringLoseDepartment() {
        return "Employee " + "id: " + id +" "+
                "FIO: " + getFIO() + '\'' +
                ", salary: " + salary;
    }

}
