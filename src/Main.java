public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Kirill", 1, 100_000);
        employees[1] = new Employee("Bob", 1, 90_000);
        employees[2] = new Employee("Jon", 2, 96_000);
        employees[3] = new Employee("Roma", 1, 110_000);
        employees[4] = new Employee("Peter", 3, 60_000);
        employees[5] = new Employee("Kris", 4, 50_000);
        employees[6] = new Employee("Ron", 2, 94_000);
        employees[7] = new Employee("Ann", 1, 112_000);
        employees[8] = new Employee("Gleb", 3, 60_000);
        employees[9] = new Employee("Ilya", 4, 50_000);

    }

    public static void allEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static int allSalaryInMonth(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static String minSalaryOnEmployee(Employee[] employees) {
        int a = 10_00_000_000;
        String b = " 1111 ";
        for (Employee employee : employees) {
            if (employee.getSalary() < a) {
                a = employee.getSalary();
                b = employee.toString();
            }
        }
        return "Минимальная зарплата у " + b;
    }

    public static String mixSalaryOnEmployee(Employee[] employees) {
        int a = 0;
        String b = " 1111 ";
        for (Employee employee : employees) {
            if (employee.getSalary() > a) {
                a = employee.getSalary();
                b = employee.toString();
            }
        }
        return "Масимальная зарплата у " + b;
    }

    public static String middleSalary(Employee[] employees) {
        int a;
        a = allSalaryInMonth(employees) / employees.length;
        return "Средняя зароботная плата за месяц " + a;
    }

    public static void fioAllEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFIO());
        }
    }

    public static void shiftSalary(Employee[] employees, int i) {
        int a;
        for (Employee employee : employees) {
            a = employee.getSalary() + (employee.getSalary() * i / 100);
            employee.setSalary(a);
        }

    }

    public static String minSalaryInDepartment(Employee[] employees, int department) {
        int a = 10_00_000_000;
        String b = " 1111 ";
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (employee.getSalary() < a) {
                    a = employee.getSalary();
                    b = employee.toString();
                }

            }
        }
        return "Минимальная зарплата в " + department + " отделе у " + b;
    }

    public static String maxSalaryInDepartment(Employee[] employees, int department) {
        int a = 0;
        String b = " 1111 ";
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (employee.getSalary() > a) {
                    a = employee.getSalary();
                    b = employee.toString();
                }

            }
        }
        return "Максимальная зарплата в " + department + " отделе у " + b;
    }

    public static int sumSalaryInDepartment(Employee[] employees, int department) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static String middleSalaryInDepartment(Employee[] employees, int department) {
        int a;
        a = sumSalaryInDepartment(employees, department) / numberAllEmployeeInDepartment(employees, department);
        return "Средняя заробатная плата в " + department + " отделе: " + a;
    }

    public static void shiftSalaryInDepartment(Employee[] employees, int department, int i) {
        int a;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                a = employee.getSalary() + (employee.getSalary() * i / 100);
                employee.setSalary(a);
            }
        }
    }

    public static int numberAllEmployeeInDepartment(Employee[] employees, int department) {
        int a = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                a += 1;
            }
        }
        return a;
    }

    public static void allEmployeeInDepartment(Employee[] employees, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.toStringLoseDepartment());
            }
        }
    }

    public static void salaryLessNumber(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println(employee.toStringLoseDepartment());
            }
        }
    }

    public static void salaryMoreNumber(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= number) {
                System.out.println(employee.toStringLoseDepartment());
            }
        }
    }

}
