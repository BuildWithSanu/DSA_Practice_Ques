package org.practice.array.string;

import java.util.ArrayList;
import java.util.List;


//412. Fizz Buzz
//Given an integer n, return a string array answer (1-indexed) where:
//• answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//• answer[i] == "Fizz" if i is divisible by 3.
//• answer[i] == "Buzz" if i is divisible by 5.
//• answer[i] == i (as a string) if none of the above conditions are true.
// Constraints:
//• 1 <= n <= 104


public class FizzBuzzProblem {
    public static void main(String[] args) {
        FizzBuzzProblem obj = new FizzBuzzProblem();
        int n = 15;
        String[] result = obj.fizzBuzz(n);
        for (String str : result) {
            System.out.print(str + " ");
        }
    }

    public String[] fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3 && divisibleBy5) {
                answer.add("FizzBuzz");
            } else if (divisibleBy3) {
                answer.add("Fizz");
            } else if (divisibleBy5) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }
        return answer.toArray(new String[0]);
    }
    // Time complexity = O(n)
    // Space complexity = 0(1)
}
