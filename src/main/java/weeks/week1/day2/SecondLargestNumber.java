package weeks.week1.day2;

public class SecondLargestNumber {

    public static void main(String[] args) {

//        Accepted

        int[] integers = {1, 5, 60, 2, 11, 4, 8};

        int temp = 0;
        for (int i = 0; i < integers.length; i++) {
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[i] > integers[j]) {
                    temp = integers[j];
                    integers[j] = integers[i];
                    integers[i] = temp;
                }
            }
        }

        System.out.println("Second largest number is " + integers[integers.length - 2]);

//        for (int i = 0; i < integers.length; i++) {
//            System.out.println(integers[i]);
//        }


//  ***********  Belə də ola bilər: ***********

        int[] arr = {1, 5, 60, 2, 11, 4, 8};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                // yeni ən böyük tapılıb
                second = largest;
                largest = num;
            } else if (num > second && num < largest) {
                // aralıqda yerləşən (ikinci ən böyük) tapılıb
                second = num;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + second);
    }
}