package Day8_train;

import java.util.Scanner;

public class ID {
    public static void verify(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.length() != 18) {
            System.out.println("身份证位数输入有误！");
        } else if (sb.charAt(0) == '0') {//可用sb.StartWith("0")判断
            System.out.println("身份证位数输入有误！");
        } else {
            lo:if (sb.charAt(sb.length() - 1) >= '0' && sb.charAt(sb.length() - 1) <= '9' || sb.charAt(sb.length() - 1) == 'X') {
                for (int i = 0; i < sb.length() - 1; i++) {
                    if (sb.charAt(i) >= '0' && sb.charAt(i) <= '9') {
                    } else {
                        System.out.println("身份证信息有误！");
                        break lo;
                    }
                }
                System.out.println("身份验证成功！");
            } else {
                System.out.println("身份证输入有误！");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身份证号：");
        String s = sc.nextLine();
        verify(s);
    }
}
