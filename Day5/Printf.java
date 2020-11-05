package Day5;

import java.util.Scanner;

public class Printf {
    public static void print(int a, int b) {
        if (a < b) { int c = a,d = b;a=d;b=c;}//交换数据

        for (int i = b; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
//        } else {
//            for (int i = a; i <= b; i++) {
//                if (i % 2 != 0) {
//                    System.out.print(i + " ");
//                }
//            }
//        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数确定范围");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("其中奇数为");
        print(a, b);
    }
}
