import java.util.Scanner;
public class Train2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个整数");
		int num2 = sc.nextInt();
		System.out.println("请输入第三个整数");
		int num3 = sc.nextInt();
		if (num1<=num2&&num1<=num3){
			System.out.println("最小值为"+num1);
		}
		else if (num2<=num1&&num2<=num3){
			System.out.println("最小值为"+num2);
		}
		else {
			System.out.println("最小值为"+num3);
		}
		
		/*if (num1 > num2){
			if (num2 > num3){
				System.out.println("最小值为"+num3);
			}
			else System.out.println("最小值为"+num2);
		}
		else {
			if (num1 < num3){
				System.out.println("最小值为"+num1);
			}
			else System.out.println("最小值为"+num3);
		}*/
		
	}
}