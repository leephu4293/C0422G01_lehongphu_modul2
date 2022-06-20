package queue_stack;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap bieu thuc ");
        String string = sc.nextLine();
        final   char  LEFT = '(';
        final char RIGHT = ')';
        Stack<Character>  bracket = new Stack<>();
        boolean flag = true;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == LEFT){
                bracket.push(string.charAt(i));
            } else if (string.charAt(i)==RIGHT){
                if (bracket.isEmpty()) {
                    flag = false;
                    break;
                } else  {
                    bracket.pop();
                }

            }
        }
        if (!flag){
            System.out.println("false");
        }else if (bracket.size()==0){
            System.out.println("true");

        }else {
            System.out.println("false");
        }

    }
}
