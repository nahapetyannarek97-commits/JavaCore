package homeworks.employee;

public class CompanyStorage {

    private Company[] companies = new Company[10];
    private int size = 0;

    public void add(Company company) {

        if (company == null) {
            return;
        }

        if (getById(company.getCompanyId()) != null) {
            System.out.println("Company already exists.");
            return;
        }

        if (size == companies.length) {
            Company[] newCompanies = new Company[companies.length * 2];

            for (int i = 0; i < size; i++) {
                newCompanies[i] = companies[i];
            }

            companies = newCompanies;
        }

        companies[size++] = company;

        System.out.println("Company successfully added!");
    }

    public void printAll() {

        if (size == 0) {
            System.out.println("No companies found.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
        }
    }

    public Company getById(String id) {

        for (int i = 0; i < size; i++) {

            if (companies[i].getCompanyId().equals(id)) {
                return companies[i];
            }
        }

        return null;
    }
}



