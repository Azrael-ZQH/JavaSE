package Day8_train;

import java.util.Random;
import java.util.Scanner;

public class RegisterSystem {
    public static String verify(){//生成验证码
        Random r = new Random();
        StringBuilder s = new StringBuilder();
        /**
         * for(char i = 'a';i<='z';i++){s.append(i);}
         * for(char i = 'A';i<='Z';i++){s.append(i);}
         * for(char i = '0';i<='9';i++){s.append(i);}
         * String s ="";
         * for (int i = 0; i < 4; i++) {//字符串中的字符有索引，随机获取一个索引即相当于随机获取到了该索引的字符
         *      int index = r.nextInt(sb.length()); // 从索引0（包含）到字符串的长度（不包含）
         *      code += sb.charAt(index); // 获取该索引上的字符
         * }
         */
        for (int i = 0; i < 4; i++) {
            char a = (char) (r.nextInt(10) + 48);
            char b = (char) (r.nextInt(26) + 65);//A-Z65-90 a-z 97-122
            char c = (char) (r.nextInt(26) + 97);
            char[] arr = {a, b, c};
            s.append(arr[r.nextInt(3)]);
        }
        String ss=s.toString();
        return ss;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码");
        for(int i = 0;i<3;i++) {
            String s = verify();
            System.out.println("生成验证码为："+s);
            if (s.equalsIgnoreCase(sc.nextLine())){
                System.out.println("输入验证码正确");
                break;
            }
            else if(i<2){
                System.out.println("您还有"+(2-i)+"次机会，将会为您重新发送，请重新输入");
                continue;
            }
            else {
                System.out.println("您的身份验证失败");
            }
        }
    }
}
