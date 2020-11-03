import java.util.Scanner;
import java.util.Random;

public class Game{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int x = r.nextInt(100)+1;
		int boss = 666;
		while(true){
			System.out.println("猜一个数（1-100）");
			int num = sc.nextInt();
			if(num==boss){
				System.out.println(x);
			}
			else if (num>x){
				System.out.println("猜大了");
			}
			else if (num<x){
				System.out.println("猜小了");
			}
			else {
				System.out.println("猜对了");
				break;
			}
			
		}
	}
}