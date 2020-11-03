import java.util.Scanner;
public class Cal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();
		
		System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): ");
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
			System.out.println("要求运算有误");
			break;
		}
	}
}