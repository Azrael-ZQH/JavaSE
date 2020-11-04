package Day4;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =new int[5];
        System.out.println("请输入五个整数");

//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//        int num4 = sc.nextInt();
//        int num5 = sc.nextInt();
//        int[] arr = {num1,num2,num3,num4,num5};//new int[5];
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("sum="+sum);


    }
}
