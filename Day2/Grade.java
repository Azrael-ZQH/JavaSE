import java.util.Scanner;
public class Grade{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ĳɼ���");
		float scores = sc.nextFloat();
		if (scores <= 100&&scores >= 0){
		if (scores >= 95 && scores <= 100){
			System.out.println("�������г�");
		}
		else if (scores >= 90 && scores <= 94){
			System.out.println("�������ֳ�");
		}
		else if (scores >= 80 && scores <= 89){
			System.out.println("�������ν��");
		}
		else System.out.println("����");
		}
		else System.out.println("�ɼ����Ϸ�");
	}
}