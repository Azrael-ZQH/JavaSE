package Day5_train;

import java.util.Scanner;

public class Train1_6 {
    public static double min(double a, double b) {
        if (a >= b) {
            return b;
        } else return a;
    }

    public static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    /*            if (a >= b) {
                if (a >= c) {
                    return a;
                } else {
                    return c;
                }
            } else {
                if (b >= c) {
                    return b;
                } else {
                    return c;
                }
            }*/
    public static void pattern(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int s = 0; s < b; s++) {
                System.out.print("@");
            }
            System.out.println();
        }
        return;
    }

    public static void boom(int a) {
        if (a >= 1 & a <= 9) {
            for (int i = 1; i <= a; i++) {
                for (int s = 1; s <= i; s++) {
                    System.out.print(s + "*" + i + "=" + i * s + "\t");
                }
                System.out.println();
            }
        }
        return;
    }

    public static void sort(int a, int b, int c) {
        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a >= b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
    /*//定义变量存储最大值
        int max = 0;
        //定义变量存储最小值
        int min = 0;
        //判断最大值
        if(a > b && a > c ){
            max = a;
        }else if(b > a && b > c){
            max = b;
        }else{
            max = c;
        }
        //判断最小值
        if(a < b && a < c ){
            min = a;
        }else if(b < a && b < c){
            min = b;
        }else{
            min = c;
        }
        //计算中间值
        int mid = a + b + c - max - min;
        System.out.println("从大到小的顺序是：" + max + " "+ mid + " " + min);
    * */

    public static double abs(double a){
        if(a<0){
            double ab = -a;
            return ab;
        }
        else return a;
    }
    public static void main(String[] args) {
        System.out.println("请输入俩个小数比大小");
        Scanner sc = new Scanner(System.in);
        System.out.println("较小数为" + min(sc.nextDouble(), sc.nextDouble()));
        System.out.println("请输入三个整数比大小");
        System.out.println("最大数为" + max(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.println("请输入打印图案的行和列");
        pattern(sc.nextInt(), sc.nextInt());
        System.out.println("请输入1-9中的一个数来制备的乘法表");
        boom(sc.nextInt());
        System.out.println("三个整数排序由大到小，请输入三个整数");
        sort(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("请输入一个小数，判断绝对值");
        System.out.println(abs(sc.nextDouble()));
    }
}
