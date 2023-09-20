package ExerciseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class BasicQueueOperations04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //You will be given an integer
        // N representing the number of elements to enqueue(add),
        // an integer S representing the number of elements to dequeue (remove/poll) from the queue,

        // and finally, an integer X, an element that you should check whether is present in the queue.
        //  If it is - prints true on the console,
        //  if it is not - print the smallest element currently present in the queue.

        String []input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);
        int X = Integer.parseInt(input[2]);

        Deque<Integer> queue = new ArrayDeque<>();

        String []secondInput = sc.nextLine().split(" ");

        for (int i = 0; i < N; i++) {
            int element = Integer.parseInt(secondInput[i]);
            queue.offer(element);
        }

        for (int i = 0; i < S; i++) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(X)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(queue));
        }





    }
}
