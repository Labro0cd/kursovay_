import java.util.Objects;

public class Employee {
    private final String FIO;
    private int department;
    private int salary;
    private final int id;

    static int ID = 0;


    public Employee(String FIO, int department, int salary) {
        this.FIO = FIO;
        this.department = department;
        this.salary = salary;
        ID += 1;
        id = ID;
    }

    public String getFIO() {
        return FIO;
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
                "FIO='" + FIO + '\'' +
                ", department=" + department +
                ", salary=" + salary;
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
        return Objects.hash(FIO, department, salary, id);
    }

    public String toStringLoseDepartment() {
        return "Employee " + "id=" + id +" "+
                "FIO='" + FIO + '\'' +
                ", salary=" + salary;
    }

}
