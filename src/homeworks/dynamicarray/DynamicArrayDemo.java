package homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();

        da.add(5);
        da.add(10);
        da.add(15);
        da.add(20);
        da.add(25);

        da.print();

        for (int i = 1; i <= 10; i++) {
            da.add(i * 10);
        }

        da.print();

        for (int i = 1; i <= 10; i++) {
            da.add(i * 100);
        }

        da.print();

        System.out.println(da.getByIndex(0));
        System.out.println(da.getByIndex(24));
        System.out.println(da.getByIndex(-1));
        System.out.println(da.getByIndex(100));
    }
}

