import java.util.Scanner;
public class Reward{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的成绩：");
		float scores = sc.nextFloat();
		if (scores<=100&scores>=95){
			System.out.println("奖励1000元");
		}
		else if (scores>=90&scores<=95){
			System.out.println("奖励500元");
		}
		else if (scores>=80&scores<=89){
			System.out.println("奖励变形金刚");
		}
		else if (scores<=79&scores>=0){
			System.out.println("暴揍，奖励十套练习题");
		}
		else {System.out.println("您输入的成绩有误");
		}
	}
}