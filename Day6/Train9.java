package Day6_train;

import java.util.Scanner;

public class Train9 {
    public static int sum(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        return a;
    }

    public static int max(int[] arr) {
        int a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (a < arr[i]) {
                a = arr[i];
            }
        }
        return a;
    }

    public static int min(int[] arr) {
        int a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (a > arr[i]) {
                a = arr[i];
            }
        }
        return a;
    }

    public static int ave(int sum, int[] arr) {
        sum = sum / arr.length;
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        System.out.println("请输入六位评委分数（0-100）");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int h = max(arr);
        int l = min(arr);
        int a = sum(arr);
        int o = ave(a, arr);
        System.out.println("最高分为：" + h);
        System.out.println("最低分为：" + l);
        System.out.println("总分为：" + a);
        System.out.println("去掉一个最高分去掉一个最低分后，平均分为：" + o);
    }
}
