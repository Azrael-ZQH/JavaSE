import java.util.Scanner;
public class Reward{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���������ĳɼ���");
		float scores = sc.nextFloat();
		if (scores<=100&scores>=95){
			System.out.println("����1000Ԫ");
		}
		else if (scores>=90&scores<=95){
			System.out.println("����500Ԫ");
		}
		else if (scores>=80&scores<=89){
			System.out.println("�������ν��");
		}
		else if (scores<=79&scores>=0){
			System.out.println("���ᣬ����ʮ����ϰ��");
		}
		else {System.out.println("������ĳɼ�����");
		}
	}
}