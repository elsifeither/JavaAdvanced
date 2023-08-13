package StacksAndQueuesPractise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory01practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String instruction = sc.nextLine();
        ArrayDeque<String> urlsDeque = new ArrayDeque<>();
        String currentUrl = "";

        while (!instruction.equals("Home")) {

            if (instruction.equals("back")) {
                if (urlsDeque.isEmpty()) {
                    System.out.println("no previous URLs");
                    instruction = sc.nextLine();
                    continue;
                } else {
                    currentUrl = urlsDeque.pop();
                }

            } else {
                if (!currentUrl.isEmpty()) {
                    urlsDeque.push(currentUrl);
                }
                currentUrl = instruction;
            }


            System.out.println(currentUrl);
            instruction = sc.nextLine();
        }


    }
}