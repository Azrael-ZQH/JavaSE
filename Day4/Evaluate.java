package Day4;

import java.util.Scanner;

public class Evaluate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请六位评委打分（0-100）");
        int[] arr = new int[6];
        int max = 0, min = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 0 && arr[i] <= 100) {
                if (arr[max] < arr[i]) {
                    max = i;
                }
                if (arr[min] > arr[i]) {
                    min = i;
                }
            }
            else {
                System.out.println("您的打分有误");
                i--;
            }
        }
//        System.out.println(arr[max]);//调试代码
//        System.out.println(arr[min]);//调试代码
            if (max == min) {//防止所有数相同的情况
                max++;
            }
            arr[max] = 0;
            arr[min] = 0;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
//            System.out.println(arr[i]);//调试代码
            }
            System.out.println("平均分为：" + sum / (arr.length - 2));
        }
}

