package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EmployeeStorage employeeStorage = new EmployeeStorage();
        CompanyStorage companyStorage = new CompanyStorage();

        boolean running = true;

        while (running) {

            System.out.println("\n========== EMPLOYEE MANAGEMENT ==========");
            System.out.println("0 - EXIT");
            System.out.println("1 - ADD EMPLOYEE");
            System.out.println("2 - PRINT ALL EMPLOYEES");
            System.out.println("3 - SEARCH EMPLOYEE BY ID");
            System.out.println("4 - SEARCH EMPLOYEES BY COMPANY NAME");
            System.out.println("5 - ADD COMPANY");
            System.out.println("6 - PRINT ALL COMPANIES");
            System.out.println("7 - SEARCH COMPANY BY ID");
            System.out.println("8 - PRINT EMPLOYEES BY COMPANY ID");
            System.out.println("9 - CHANGE EMPLOYEE COMPANY");
            System.out.println("10 - PRINT EMPLOYEE COMPANY");
            System.out.println("11 - COUNT EMPLOYEES BY COMPANY");
            System.out.println("12 - TOTAL SALARY BY COMPANY");
            System.out.println("=========================================");

            System.out.print("Choose command: ");

            int command;

            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid command.");
                continue;
            }

            switch (command) {

                case 0:
                    running = false;
                    System.out.println("Program finished.");
                    break;

// Add employee
                case 1:

                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter employee surname: ");
                    String surname = scanner.nextLine();

                    System.out.print("Enter employee ID: ");
                    String employeeId = scanner.nextLine();

                    System.out.print("Enter employee salary: ");

                    double salary;

                    try {
                        salary = Double.parseDouble(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid salary.");
                        break;
                    }

                    System.out.print("Enter employee position: ");
                    String position = scanner.nextLine();

                    System.out.print("Enter company ID: ");
                    String companyId = scanner.nextLine();

                    Company company = companyStorage.getById(companyId);

                    if (company != null) {

                        Employee employee = new Employee(
                                name,
                                surname,
                                employeeId,
                                salary,
                                company,
                                position
                        );

                        employeeStorage.add(employee);

                    } else {

                        System.out.println(
                                "Company with ID " + companyId + " not found."
                        );

                        System.out.println("Please add the company first.");
                    }

                    break;

// Print all employees
                case 2:

                    employeeStorage.printAll();

                    break;

// SearchEmployeeByID
                case 3:

                    System.out.print("Enter employee ID: ");
                    String searchEmployeeId = scanner.nextLine();

                    Employee foundEmployee =
                            employeeStorage.getById(searchEmployeeId);

                    if (foundEmployee != null) {

                        System.out.println("Employee found:");

                        System.out.println(foundEmployee);

                    } else {

                        System.out.println("Employee not found.");
                    }

                    break;

// SearchEmployeeByCompany
                case 4:

                    System.out.print("Enter company name: ");
                    String searchCompanyName = scanner.nextLine();

                    employeeStorage.printByCompanyName(searchCompanyName);

                    break;

// AddCompany
                case 5:

                    System.out.print("Enter company ID: ");
                    String newCompanyId = scanner.nextLine();

                    System.out.print("Enter company name: ");
                    String companyName = scanner.nextLine();

                    System.out.print("Enter industry: ");
                    String industry = scanner.nextLine();

                    System.out.print("Enter country: ");
                    String country = scanner.nextLine();

                    Company newCompany = new Company(
                            newCompanyId,
                            companyName,
                            industry,
                            country
                    );

                    companyStorage.add(newCompany);

                    break;

// PRint all companies
                case 6:

                    System.out.println("Companies:");

                    companyStorage.printAll();

                    break;

// Search company by id
                case 7:

                    System.out.print("Enter company ID: ");
                    String searchCompanyId = scanner.nextLine();

                    Company foundCompany =
                            companyStorage.getById(searchCompanyId);

                    if (foundCompany != null) {

                        System.out.println("Company found:");

                        System.out.println("ID: " +
                                foundCompany.getCompanyId());

                        System.out.println("Name: " +
                                foundCompany.getName());

                        System.out.println("Industry: " +
                                foundCompany.getIndustry());

                        System.out.println("Country: " +
                                foundCompany.getCountry());

                    } else {

                        System.out.println("Company not found.");
                    }

                    break;

// print employee by company
                case 8:

                    System.out.print("Enter company ID: ");
                    String searchId = scanner.nextLine();

                    Company searchedCompany =
                            companyStorage.getById(searchId);

                    if (searchedCompany != null) {

                        System.out.println("Company: " +
                                searchedCompany.getName());

                        System.out.println("Employees:");

                        employeeStorage.printByCompanyId(searchId);

                    } else {

                        System.out.println("Company not found.");
                    }

                    break;

// Change employee company
                case 9:

                    System.out.print("Enter employee ID: ");
                    String changeEmployeeId = scanner.nextLine();

                    Employee employeeToChange =
                            employeeStorage.getById(changeEmployeeId);

                    if (employeeToChange == null) {

                        System.out.println("Employee not found.");
                        break;
                    }

                    System.out.println("Current company: " +
                            employeeToChange.getCompany().getName());

                    System.out.print("Enter new company ID: ");
                    String newCompanyIdForEmployee = scanner.nextLine();

                    Company newCompanyForEmployee =
                            companyStorage.getById(newCompanyIdForEmployee);

                    if (newCompanyForEmployee != null) {

                        employeeToChange.setCompany(newCompanyForEmployee);

                        System.out.println(
                                "Employee company successfully changed!"
                        );

                        System.out.println("New company: " +
                                employeeToChange.getCompany().getName());

                    } else {

                        System.out.println("Company not found.");
                    }

                    break;

// PrintEmployeeCompany
                case 10:

                    System.out.print("Enter employee ID: ");
                    String employeeIdForCompany = scanner.nextLine();

                    Employee employeeForCompany =
                            employeeStorage.getById(employeeIdForCompany);

                    if (employeeForCompany != null) {

                        Company employeeCompany =
                                employeeForCompany.getCompany();

                        System.out.println("Employee: " +
                                employeeForCompany.getName() + " " +
                                employeeForCompany.getSurname());

                        System.out.println("Company information:");

                        System.out.println("ID: " +
                                employeeCompany.getCompanyId());

                        System.out.println("Name: " +
                                employeeCompany.getName());

                        System.out.println("Industry: " +
                                employeeCompany.getIndustry());

                        System.out.println("Country: " +
                                employeeCompany.getCountry());

                    } else {

                        System.out.println("Employee not found.");
                    }

                    break;

// Bonus 1
                case 11:

                    System.out.print("Enter company ID: ");
                    String countCompanyId = scanner.nextLine();

                    Company countCompany =
                            companyStorage.getById(countCompanyId);

                    if (countCompany != null) {

                        int count = employeeStorage
                                .countEmployeesByCompany(countCompanyId);

                        System.out.println("Company: " +
                                countCompany.getName());

                        System.out.println("Employees count: " + count);

                    } else {

                        System.out.println("Company not found.");
                    }

                    break;

// bonus2
                case 12:

                    System.out.print("Enter company ID: ");
                    String salaryCompanyId = scanner.nextLine();

                    Company salaryCompany =
                            companyStorage.getById(salaryCompanyId);

                    if (salaryCompany != null) {

                        double totalSalary = employeeStorage
                                .calculateTotalSalaryByCompany(salaryCompanyId);

                        System.out.println("Company: " +
                                salaryCompany.getName());

                        System.out.println("Total salary: " + totalSalary);

                    } else {

                        System.out.println("Company not found.");
                    }

                    break;

                default:

                    System.out.println("Invalid command.");

                    break;
            }
        }

        scanner.close();
    }
}

