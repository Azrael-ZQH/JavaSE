import java.util.Scanner;
public class Cal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int num = sc.nextInt();
		int geWei = num %10;
		int shiWei = num / 10 %10;
		int baiWei = num / 100;
		System.out.println("����"+num+"��λΪ"+geWei);
		System.out.println("����"+num+"ʮλΪ"+shiWei);
		System.out.println("����"+num+"��λΪ"+baiWei);
		System.out.println(18.9/3);
		
	}
}