import java.util.Scanner;
public class Height{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����Ҫ�Ƚϵ����ֵ");
		float height1 = sc.nextFloat();
		System.out.println("������ڶ�����Ҫ�Ƚϵ����ֵ");
		float height2 = sc.nextFloat();
		System.out.println("�������������Ҫ�Ƚϵ����ֵ");
		float height3 = sc.nextFloat();
		float tallest = height1>height2?(height1>height3?height1:height3):(height2>height3?height2:height3);
		System.out.println("������Ϊ��"+tallest);
	}
}