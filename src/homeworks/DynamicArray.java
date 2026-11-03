package homeworks;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class DynamicArrayDemo {

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

        DynamicArray empty = new DynamicArray();

        System.out.println(empty.getByIndex(0));
    }
}

