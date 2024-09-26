public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Kirill","K","A", 1, 100_000);
        employees[1] = new Employee("Bob","S","A", 1, 90_000);
        employees[2] = new Employee("Jon","A","B", 2, 96_000);
        employees[3] = new Employee("Roma","A","C", 1, 110_000);
        employees[4] = new Employee("Peter","A","D", 3, 60_000);
        employees[5] = new Employee("Kris","K","H", 4, 50_000);
        employees[6] = new Employee("Ron","F","A", 2, 94_000);
        employees[7] = new Employee("Ann","A","O", 1, 112_000);
        employees[8] = new Employee("Gleb","A","I", 3, 60_000);
        employees[9] = new Employee("Ilya","A","K", 4, 50_000);

        allEmployee(employees);
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
        int salary = employees[0].getSalary();
        String employeeMinSalary = employees[0].toString();
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                salary = employee.getSalary();
                employeeMinSalary = employee.toString();
            }
        }
        return "Минимальная зарплата у " + employeeMinSalary;
    }

    public static String maxSalaryOnEmployee(Employee[] employees) {
        int salary = 0;
        String employeeMaxSalary = employees[0].toString();
        for (Employee employee : employees) {
            if (employee.getSalary() > salary) {
                salary = employee.getSalary();
                employeeMaxSalary = employee.toString();
            }
        }
        return "Масимальная зарплата у " + employeeMaxSalary;
    }

    public static String middleSalary(Employee[] employees) {
        int middleSalary;
        middleSalary = allSalaryInMonth(employees) / employees.length;
        return "Средняя зароботная плата за месяц " + middleSalary;
    }

    public static void fioAllEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFIO());
        }
    }

    public static void shiftSalary(Employee[] employees, int i) {
        int shiftSalary;
        for (Employee employee : employees) {
            shiftSalary = employee.getSalary() + (employee.getSalary() * i / 100);
            employee.setSalary(shiftSalary);
        }

    }

    public static String minSalaryInDepartment(Employee[] employees, int department) {
        int a = employees[0].getSalary();
        String b = employees[0].toString();
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
        int a = employees[0].getSalary();
        String b = employees[0].toString();
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
        int middleSalary;
        middleSalary = sumSalaryInDepartment(employees, department) / numberAllEmployeeInDepartment(employees, department);
        return "Средняя заробатная плата в " + department + " отделе: " + middleSalary;
    }

    public static void shiftSalaryInDepartment(Employee[] employees, int department, int i) {
        int shiftSalary;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                shiftSalary = employee.getSalary() + (employee.getSalary() * i / 100);
                employee.setSalary(shiftSalary);
            }
        }
    }

    public static int numberAllEmployeeInDepartment(Employee[] employees, int department) {
        int numberEmployee = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                numberEmployee += 1;
            }
        }
        return numberEmployee;
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
