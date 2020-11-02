import java.util.Scanner;
public class Train3{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("请问您是否为本店会员？（True or False）");
	boolean grade = sc.nextBoolean();
	System.out.println("请您输入当前商品价格");
	double price = sc.nextDouble();
	if (price >= 0){
			if (grade){
				if (price < 200){
					System.out.println("八折优惠后价格为："+(price*0.8)+"元");
					}
				else {
					System.out.println("七五折优惠后价格为："+(price*0.75)+"元");
					}
				}
			else {
				if (price > 100){
					System.out.println("九折优惠后价格为："+(price*0.9)+"元");
					}
				else {
					System.out.println("由于您不是本店会员，暂无优惠，其价格为："+price+"元");
					}
				}
		
			}
	else {
		System.out.println("你输入的价格有误");
		}
	}
}