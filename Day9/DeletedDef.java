package Day9_train;

import java.util.ArrayList;

public class DeletedDef {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("def");
        list.add("abc");
        list.add("def");
        list.add("def");
        list.add("zzz");
        list.add("def");
        String s = "def";
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (s.equals(list.get(i))) {
                count++;
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
