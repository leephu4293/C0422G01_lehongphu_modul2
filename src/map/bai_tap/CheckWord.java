package map.bai_tap.thuc_hanh;

import java.util.*;

public class CheckWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuoi can kiem tra ");
        String string = sc.nextLine().toLowerCase().trim();
        String[] array = string.split(" ");
        TreeMap<String, Integer> checkstr = new TreeMap<>();
        for (String key :array) {
            if (!key.equals(" ")) {
                if (checkstr.containsKey(key)) {
                    checkstr.put(key, checkstr.get(key) + 1);
                } else {
                    checkstr.put(key, 1);
                }
            }
        }
            Set<String> keystr = checkstr.keySet();
            for (String x : keystr) {
                System.out.println("tu " + x + " xuat  hien " + checkstr.get(x) + " lan");
            }

}
}
