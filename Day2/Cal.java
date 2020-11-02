import java.util.Scanner;
public class Cal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int num = sc.nextInt();
		int geWei = num %10;
		int shiWei = num / 10 %10;
		int baiWei = num / 100;
		System.out.println("整数"+num+"个位为"+geWei);
		System.out.println("整数"+num+"十位为"+shiWei);
		System.out.println("整数"+num+"百位为"+baiWei);
		System.out.println(18.9/3);
		
	}
}