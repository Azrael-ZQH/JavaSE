import java.util.Scanner;
public class Cal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��������");
		int a = sc.nextInt();
		
		System.out.println("������ڶ���������");
		int b = sc.nextInt();
		
		System.out.println("��������Ҫ���е�����(1:��ʾ�ӷ�,2:��ʾ����,3:��ʾ�˷�,4:��ʾ����): ");
		int c = sc.nextInt();
		
		switch (c){
			case 1:
			System.out.println(a+"+"+b+"="+(a+b));
			break;
			case 2:
			System.out.println(a+"-"+b+"="+(a-b));
			break;
			case 3:
			System.out.println(a+"*"+b+"="+(a*b));
			break;
			case 4:
			System.out.println(a+"/"+b+"="+(a/b));
			break;
			default :
			System.out.println("Ҫ����������");
			break;
		}
	}
}