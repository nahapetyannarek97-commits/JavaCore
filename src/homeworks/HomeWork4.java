package homeworks;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int count = 0;
        int n = 6;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            }
        }
        System.out.println("count of 6; " + count);

        for (int i = 0; i < numbers.length; i++) {
            int swap = numbers.length;
            System.out.print(numbers[numbers.length - 1 - i] + " ");
        }

        System.out.println();
        int repnumbers = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean alreadyChecked = false;
            for (int j = 0; j < i; j++) {
                if (numbers[j] == numbers[i]) {
                    alreadyChecked = true;
                    break;
                }
                if(alreadyChecked){
                    continue;
                }
                int count1 = 0;
                for (int k = 0; k < numbers.length; k++) {
                    if(numbers[k] == numbers[i]){
                        count++;
                    }
                }
                if(count > 1){
                    repnumbers++;
                }
            }
        }
        System.out.println(repnumbers);

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int vowelsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c  == 'ա' ||c  == 'ե' ||c  == 'է' ||c  == 'ը' ||c  == 'ի' ||c  == 'օ' ||c  == 'ո' ||c  == 'ւ'){
               vowelsCount++;
           }
        }
        System.out.println(vowelsCount);
    }
}
