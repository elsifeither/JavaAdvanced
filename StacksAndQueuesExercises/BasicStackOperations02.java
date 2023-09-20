package ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class BasicStackOperations02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        String[] numbers = sc.nextLine().split(" ");
        int n = Integer.parseInt(numbers[0]);
        int s = Integer.parseInt(numbers[1]);
        int x = Integer.parseInt(numbers[2]);

        String[] input = sc.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int element = Integer.parseInt(input[i]);
            stack.push(element);
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }



        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(x)) {
            System.out.println("true");
        } else {
                                    //     System.out.println(Collections.min(stack)); code in 1 line >>
            int smallestNumber = Integer.MAX_VALUE;
            while (!stack.isEmpty()) {
                int element2 = stack.pop();
                if (element2 < smallestNumber) {
                    smallestNumber = element2;
                }
            }
            System.out.println(smallestNumber);
        }


    }
}
