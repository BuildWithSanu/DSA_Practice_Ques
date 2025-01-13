package org.practice;

//Number of Steps to Reduce a Number to Zero

public class GreedyAlgoNBitMProblem {
    public static void main(String[] args) {
        GreedyAlgoNBitMProblem obj = new GreedyAlgoNBitMProblem();
        int n = 14;
        System.out.println(obj.numberOfSteps(n));
    }

    public int numberOfSteps(int num) {
        int steps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            steps++;
        }
        return steps;
    }
    // Time complexity = O(log n)
    // Space complexity = 0(1)

}
