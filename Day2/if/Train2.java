import java.util.Scanner;
public class Train2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int num1 = sc.nextInt();
		System.out.println("������ڶ�������");
		int num2 = sc.nextInt();
		System.out.println("���������������");
		int num3 = sc.nextInt();
		if (num1<=num2&&num1<=num3){
			System.out.println("��СֵΪ"+num1);
		}
		else if (num2<=num1&&num2<=num3){
			System.out.println("��СֵΪ"+num2);
		}
		else {
			System.out.println("��СֵΪ"+num3);
		}
		
		/*if (num1 > num2){
			if (num2 > num3){
				System.out.println("��СֵΪ"+num3);
			}
			else System.out.println("��СֵΪ"+num2);
		}
		else {
			if (num1 < num3){
				System.out.println("��СֵΪ"+num1);
			}
			else System.out.println("��СֵΪ"+num3);
		}*/
		
	}
}