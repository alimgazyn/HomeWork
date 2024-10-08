package P5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {13, 16, 21, 29, 45, 59, 61, 60};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13 || nums[i] != 45) {
                System.out.println(true);
            } else
                System.out.println(false);
        }

    }
}



