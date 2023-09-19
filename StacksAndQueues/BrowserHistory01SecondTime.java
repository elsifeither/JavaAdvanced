package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory01SecondTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        String prevURL = "";


        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (stack.size() <= 1) {
                    System.out.println("no previous URLs");
                } else {
                    prevURL = stack.pop();
                    System.out.println(stack.peek());
                }
            } else {
                stack.push(input);
                System.out.println(stack.peek());
            }

            input = sc.nextLine();
        }


    }
}
