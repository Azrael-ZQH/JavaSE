package Day8_train;

import java.util.Scanner;

public class StringReverse {
    public static boolean judge(String s) {
        StringBuilder ss = new StringBuilder(s);
        String sss = ss.reverse().toString();
        return s.equals(sss);
    }

    public static void main(String[] args) {
        System.out.println("请输入一段字符串：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean a = judge(s);
        System.out.println("是否为对称字符串？" + a);
    }
}
