package Day8;

import java.util.Scanner;

public class RootSystem {
    public static void main(String[] args) {
        String root = "xnzz";
        String password = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("登陆账户，有三次机会");
        for (int i = 0; i < 3; i++) {
            System.out.println("root:");
            String r = sc.nextLine();
            System.out.println("password:");
            String p = sc.nextLine();
            if (r.equals(root) && p.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (i < 2) {
                    System.out.println("登陆失败，您还有" + (2 - i) + "次机会");
                } else {
                    System.out.println("登陆失败，请稍后再试");
                }
            }
        }
    }
}
