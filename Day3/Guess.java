import java.util.Random;
import java.util.Scanner;
public class Guess{
	public static void main(String[] args){
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("����1-100��һ������");
		int num = r.nextInt(100)+1;
		do {
			int may = sc.nextInt();
			if (may < num){
				System.out.println("����С��,�����²²�");
			}
			else if (may > num){
				System.out.println("���´���,�����²²�");
			}
			else {
				System.out.println("��ϲ��������������");
				break;
			}
		}while(true);
		System.out.println("��л����ʹ��");
	}
}