package linear;

import java.util.LinkedList;
import java.util.Scanner;

public class linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi ky tu ");
        String stringCheck = sc.nextLine().trim();

        LinkedList<Character> last = new LinkedList<>();
        LinkedList<Character> begin = new LinkedList<>();
        for (int i = 0; i < stringCheck.length(); i++) {
                if (begin.size()>1  && stringCheck.charAt(i) < begin.getLast() && begin.contains(stringCheck.charAt(i))){
                    begin.clear();
                }
              begin.add(stringCheck.charAt(i));
            if (begin.size() > last.size()) {
                last.clear();
                last.addAll(begin);
            }
        }
        System.out.println(last);
    }
}
