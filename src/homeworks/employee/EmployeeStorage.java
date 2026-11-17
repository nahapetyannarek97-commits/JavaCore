package homeworks.employee;

public class EmployeeStorage {

    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {

        if (employee == null) {
            return;
        }

        if (getById(employee.getEmployeeID()) != null) {
            System.out.println("Employee already exists.");
            return;
        }

        if (size == employees.length) {
            Employee[] newEmployees = new Employee[employees.length * 2];

            for (int i = 0; i < size; i++) {
                newEmployees[i] = employees[i];
            }

            employees = newEmployees;
        }

        employees[size++] = employee;

        System.out.println("Employee successfully added!");
    }

    public void printAll() {

        if (size == 0) {
            System.out.println("No employees found.");
            return;
        }

        for (int i = 0; i < size; i++) {

            Employee employee = employees[i];

            System.out.println("Employee ID: " +
                    employee.getEmployeeID());

            System.out.println("Name: " +
                    employee.getName() + " " +
                    employee.getSurname());

            System.out.println("Salary: " +
                    employee.getSalary());

            System.out.println("Position: " +
                    employee.getPosition());

            System.out.println("Company: " +
                    employee.getCompany().getName());

            System.out.println("-------------------------");
        }
    }

    public Employee getById(String id) {

        for (int i = 0; i < size; i++) {

            if (employees[i].getEmployeeID().equals(id)) {
                return employees[i];
            }
        }

        return null;
    }

    public void printByCompanyName(String name) {

        boolean found = false;

        for (int i = 0; i < size; i++) {

            Employee employee = employees[i];

            if (employee.getCompany().getName()
                    .equalsIgnoreCase(name)) {

                System.out.println(
                        employee.getEmployeeID() + " - " +
                                employee.getName() + " " +
                                employee.getSurname()
                );

                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found.");
        }
    }

    public void printByCompanyId(String id) {

        boolean found = false;

        for (int i = 0; i < size; i++) {

            Employee employee = employees[i];

            if (employee.getCompany().getCompanyId().equals(id)) {

                System.out.println(
                        employee.getEmployeeID() + " - " +
                                employee.getName() + " " +
                                employee.getSurname()
                );

                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found.");
        }
    }

// Bonus 1

    public int countEmployeesByCompany(String id) {

        int count = 0;

        for (int i = 0; i < size; i++) {

            if (employees[i].getCompany()
                    .getCompanyId().equals(id)) {

                count++;
            }
        }

        return count;
    }

// Bonus 2
    public double calculateTotalSalaryByCompany(String id) {

        double total = 0;

        for (int i = 0; i < size; i++) {

            if (employees[i].getCompany()
                    .getCompanyId().equals(id)) {

                total += employees[i].getSalary();
            }
        }

        return total;
    }
}

