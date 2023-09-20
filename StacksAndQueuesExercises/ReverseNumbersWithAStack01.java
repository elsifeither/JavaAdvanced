package ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class ReverseNumbersWithAStack01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();

        String input = sc.nextLine();
        String []numbers = input.split(" ");

        for (int i = 0; i < numbers.length; i++) {
            stack.push(Integer.parseInt(numbers[i]));
        }


//        Arrays.stream(sc.nextLine().split(" "))
//                .map(Integer::parseInt)
//                .forEach(stack::push);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }




    }
}
