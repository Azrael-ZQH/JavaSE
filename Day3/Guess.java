import java.util.Random;
import java.util.Scanner;
public class Guess{
	public static void main(String[] args){
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("请在1-100猜一个数字");
		int num = r.nextInt(100)+1;
		do {
			int may = sc.nextInt();
			if (may < num){
				System.out.println("您猜小了,请重新猜测");
			}
			else if (may > num){
				System.out.println("您猜大了,请重新猜测");
			}
			else {
				System.out.println("恭喜！！！您猜中了");
				break;
			}
		}while(true);
		System.out.println("感谢您的使用");
	}
}