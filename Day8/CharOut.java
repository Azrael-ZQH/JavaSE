package Day8;

import java.util.Scanner;

public class CharOut {
    public static void main(String[] args) {
        String s = "加油奥里给！";
        for (int i = 0; i < s.length(); i++) {
            char o = s.charAt(i);
            System.out.println(o);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符来进行统计");
        String ss = sc.nextLine();
        int d = 0, x = 0, a = 0;
        for (int i = 0; i < ss.length(); i++) {
            char o = ss.charAt(i);
            if (o >= 'A' && o <= 'Z') {
                d++;
            } else if (o >= 'a' && o <= 'z') {
                x++;
            } else if (o >= '0' && o <= '9') {
                a++;
            }
        }
        System.out.println("该字符串大写字母有" + d + "个，小写字母有" + x + "个，数字有" + a + "个");
    }
}
