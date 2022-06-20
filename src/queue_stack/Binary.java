package queue_stack;

import java.util.Scanner;
import java.util.Stack;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thap phan muon doi ");
        int number = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();
        do {
            int remainder = number %2;
            stack.push(remainder);
            number /= 2;
        }
        while ( number != 0) ;
        System.out.println("gia tri nhi phan la ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }


    }
}
