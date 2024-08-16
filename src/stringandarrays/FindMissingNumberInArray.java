package stringandarrays;

import util.DsaArrayUtil;

public class FindMissingNumberInArray {
    private static int findMissingNumber(int[] arr) {
        //according to our example our range here will be from 1 -> 10
        int n = arr.length + 1;
        //mathematical approach
        int sum = n * (n + 1) / 2; //sum of table without missing number
        for (int j : arr) {
            sum -= j;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 6, 3, 1, 2, 9, 8, 7, 4};
        DsaArrayUtil.printArray(arr);
        int missingNum = findMissingNumber(arr);
        System.out.println(missingNum);
    }


}
