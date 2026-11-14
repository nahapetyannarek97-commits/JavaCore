package homeworks.employee;
import java.util.Objects;

public class Employee {

        private String name;
        private String surname;
        private String employeeID;
        private double salary;
        private String company;
        private String position;

        public Employee(String name, String surname, String employeeID, Double salary, String company, String position) {
            this.name = name;
            this.surname = surname;
            this.employeeID = employeeID;
            this.salary = salary;
            this.company = company;
            this.position = position;
        }

        public Employee() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(String phone) {
            this.employeeID = employeeID;
        }

        public Double getSalary() {
            return salary;
        }

        public void setCompany(String company) {
            this.company = company;
        }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.name = position;
    }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            homeworks.employee.Employee employee = (Employee) o;
            return Objects.equals(name, employee.name)
                    && Objects.equals(surname, employee.surname)
                    && Objects.equals(employeeID, employee.employeeID)
                    && Objects.equals(salary, employee.salary)
                    && Objects.equals(company, employee.company)
                    && Objects.equals(position, employee.position);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, employeeID, salary, company, position);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", employeeID='" + employeeID + '\'' +
                    ", salary='" + salary + '\'' +
                    ", company='" + company + '\''+
                    ", position='" + position + '\''+
                    '}';
        }
    }

