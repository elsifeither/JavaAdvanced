package StacksAndQueuesPractise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato06practise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        int number = Integer.parseInt(sc.nextLine());
        ArrayDeque<String> names = new ArrayDeque<>();

        for (String name : input) {
            names.offer(name);
        }


        while (names.size() > 1) {

            for (int i = 1; i < number; i++) {
                names.offer(names.poll());
            }
            System.out.println("Removed " + names.poll());
        }
        System.out.printf("Last is " + names.poll());








    }
}
