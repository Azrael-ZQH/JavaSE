package Day6_train;

public class Train3 {
    public static void main(String[] args) {//不死神兔
        int[] sum = new int[20];
        sum[0] = 1;
        sum[1] = 1;
        for (int i = 2; i < sum.length; i++) {
            sum[i] = sum[i - 1] + sum[i - 2];
        }
        System.out.println("20个月后兔子数为"+sum[sum.length - 1]);
    }
}
