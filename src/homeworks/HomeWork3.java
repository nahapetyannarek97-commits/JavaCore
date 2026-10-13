package homeworks;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] numbers = {-1, 6, 3, 9, 15, 52, -3, 5, 8,};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println(numbers[0]);

        System.out.println(numbers[numbers.length - 1]);

        System.out.println(numbers.length);

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("the smallest number is " + min);


        System.out.println(numbers[numbers.length / 2]);

        System.out.println(numbers[numbers.length / 2 - 1]);

        if (numbers.length <= 2) {
            System.out.println("Cant print middle values");
        }
        int evenNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println(evenNumbers);


        int oddNumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumbers++;
            }
        }
        System.out.print(oddNumbers);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);

        double avarage = (double) sum / numbers.length;
        System.out.println(avarage);

        //bonus 1
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println(max);

    }
}
