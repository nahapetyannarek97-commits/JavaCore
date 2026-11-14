package homeworks.employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee e) {
        if (size == array.length) {
            extend();
        }
        array[size++] = e;
    }

    private void extend() {
        Employee[] tmp = new Employee[array.length + 10];
        System.arraycopy(array, 0, tmp, 0, array.length);
        array = tmp;
    }

    public Employee getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().contains(keyword)
                    || array[i].getSurname().contains(keyword)) {
                System.out.println(array[i] + " ");
            }
        }
    }

    public void searchByEmployeeID(String employeeID) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().equalsIgnoreCase(employeeID)) {
                System.out.println(array[i] + " ");
            }
        }
    }

    public void searchByCompany(String company) {
        for (int i = 0; i < size; i++) {
            if (array[i].getEmployeeID().equalsIgnoreCase(company)) {
                System.out.println(array[i] + " ");
            }
        }
    }

}

