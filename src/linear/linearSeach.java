package linear;

import javafx.scene.transform.Scale;

import java.util.*;

public class linearSeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi ky tu ");
        String stringCheck = sc.nextLine().trim();

        LinkedList<Character> last = new LinkedList<>();
        for (int i = 0; i < stringCheck.length(); i++) {
            LinkedList<Character> begin = new LinkedList<>();
            begin.add(stringCheck.charAt(i));
            for (int j = i + 1; j < stringCheck.length(); j++) {
                if (stringCheck.charAt(j) > begin.getLast()) {
                    begin.add(stringCheck.charAt(j));
                }
            }
            if (begin.size() > last.size()) {
                last.clear();
                last.addAll(begin);
            }
        }
        System.out.println(last);

    }
}



