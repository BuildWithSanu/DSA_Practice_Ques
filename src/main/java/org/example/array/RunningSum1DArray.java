package org.example.array;

public class RunningSum1DArray {
    public static void main(String[] args) {
        RunningSum1DArray obj = new RunningSum1DArray();
        int[] nums = {1, 5, 6, 8, 9};
        int[] result = obj.runningSumOfArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] runningSumOfArray(int[] num) {
        int[] result = new int[num.length];
        result[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            result[i] = num[i] + result[i - 1];
        }
        return result;
    }
}