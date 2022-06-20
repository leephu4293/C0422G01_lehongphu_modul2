package queue_stack;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap chuoi ");
        String string = sc.nextLine().trim().toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
            queue.add(string.charAt(i));
        }
        boolean flag = true ;
        for (int i = 0; i < string.length(); i++) {
            if (stack.pop()!=queue.poll()){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("la chuoi Palindrome");
        } else {
            System.out.println("khong la  chuoi Palindrome");
        }
    }
}
