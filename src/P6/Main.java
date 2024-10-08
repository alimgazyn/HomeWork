package P6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {3, 5, 1, 8, 2};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }

        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max2 && a[i] != max){
                max2 = a[i];

        }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(max2);

        int[] b = {1, 2, 3, 4, 5};

        int[] rev = new int[b.length];

        for (int i = 0; i < rev.length; i++) {
            rev[i] = b[b.length - 1 - i];
        }

        System.out.println("Реверс: " + Arrays.toString(rev));


        int count = 0;

        int chet = 0;
        int neChet = 0;

        for (int i = 0; i < b.length; i++) {
            count += b[i];
        }
        System.out.println("Cумма всех элементов массива: " + count);

        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                chet++;
            } else {
                neChet++;
            }
        }
        System.out.println("Четные цифры: " + chet);
        System.out.println("Не четные цифры: " + neChet);

        int c[] = {1, 2, 2, 3, 4, 4, 5};

        c = Arrays.stream(c).distinct().toArray();

        System.out.println(Arrays.toString(c));

    }
}
