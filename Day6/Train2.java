package Day6_train;

public class Train2 {
    public static void main(String[] args) {//逢七过
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {//个位为7，十位为7，7的倍数
                System.out.print(i + " ");
            }
        }
    }
}
