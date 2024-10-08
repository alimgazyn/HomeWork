package P6;

public class Max {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 10, 22};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];

            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
