package Day8_train;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        int a = 0;
        int z = 0;
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] > 'a' && arr[i] < 'z' || arr[i] > 'A' && arr[i] < 'Z') {
                z++;
            } else if (arr[i] > '0' && arr[i] < '9') {
                a++;
            }
        }
        System.out.println("该字符串中字母个数为：" + z + ",数字个数为：" + a);
    }
}
