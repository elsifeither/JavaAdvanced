package StacksAndQueuesPractise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets04practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        ArrayDeque<Integer> start = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (symbol == '(') {
                start.push(i);
            }

            if (symbol == ')') {
                int end = start.pop();
                String substring = input.substring(end, i+1);
                System.out.println(substring);
            }
        }




    }
}
