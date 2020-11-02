import java.util.Scanner;
public class Grade{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的成绩：");
		float scores = sc.nextFloat();
		if (scores <= 100&&scores >= 0){
		if (scores >= 95 && scores <= 100){
			System.out.println("奖励自行车");
		}
		else if (scores >= 90 && scores <= 94){
			System.out.println("奖励游乐场");
		}
		else if (scores >= 80 && scores <= 89){
			System.out.println("奖励变形金刚");
		}
		else System.out.println("暴揍");
		}
		else System.out.println("成绩不合法");
	}
}