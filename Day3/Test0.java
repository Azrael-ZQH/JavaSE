import java.util.Scanner;
public	class Test0{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//boolean go = true;
		lo:while (true){//go
		System.out.println("请输入今天的星期数");
		System.out.println("按0后退出");
		int today = sc.nextInt();
		switch (today){
			case 0:
				//go = false;
				System.out.println("感谢您的使用");
				break lo;
			case 1:
				System.out.println("亲今天该跑步了！");
				break;
			case 2:
				System.out.println("亲今天该游泳了！");
				break;
			case 3:
				System.out.println("亲今天该慢走了！");
				break;
			case 4:
				System.out.println("亲今天该动感单车了！");
				break;
			case 5:
				System.out.println("亲今天该拳击了！");
				break;
			case 6:
				System.out.println("亲今天该爬山了！");
				break;
			case 7:
				System.out.println("亲今天该好好吃一顿了！");
				break;
			default :
				System.out.println("该星期数输入错误！");
				break;
			}
		}
	}
}