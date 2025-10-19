package weeks.week1.day3;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1,3,6,9,10};
        int temp = 0;
        for (int i = 0; i < (arr.length / 2); i++) {
            temp = arr[arr.length - 1 -i];
            arr[arr.length - 1 -i] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
