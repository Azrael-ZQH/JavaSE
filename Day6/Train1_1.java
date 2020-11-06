package Day6_train;

import java.util.Scanner;

public class Train1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入对应星期数");
        int week = sc.nextInt();
        if (week >= 1 && week <= 7) {
            if (week == 1) {
                System.out.println("周一：跑步");
            } else if (week == 2) {
                System.out.println("周二：游泳");
            } else if (week == 3) {
                System.out.println("周三：慢走");
            } else if (week == 4) {
                System.out.println("周四：动感单车");
            } else if (week == 5) {
                System.out.println("周五：拳击");
            } else if (week == 6) {
                System.out.println("周六：爬山");
            } else {
                System.out.println("周日：好好吃一顿");
            }
        } else {
            System.out.println("输入星期有误");
        }
    }
}
