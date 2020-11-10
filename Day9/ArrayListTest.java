package Day9;
import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<StringBuilder> s = new ArrayList<StringBuilder>();
        StringBuilder sb = new StringBuilder("abc");
        s.add(sb);
        StringBuilder sss = new StringBuilder();
        sss = sb ;
        sss.reverse();
        System.out.println(s);
    }
}
