package stringandarrays;

import util.DsaArrayUtil;

public class SecondMaxArray {
    public static int findSecondMaxArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax && j != max) {
                secondMax = j;
            }
        }
        return secondMax;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        DsaArrayUtil.printArray(arr);
        int i = findSecondMaxArray(arr);
        System.out.println(i);
    }
}