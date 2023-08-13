import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> newNumber = new ArrayDeque<>();

        if (number == 0) {
            System.out.println(number);
        }
        while (number != 0) {
            newNumber.push(number%2);
            number /= 2;
        }

        while (!newNumber.isEmpty()) {
            System.out.print(newNumber.pop());
        }


        
    }
}