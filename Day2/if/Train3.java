import java.util.Scanner;
public class Train3{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("�������Ƿ�Ϊ�����Ա����True or False��");
	boolean grade = sc.nextBoolean();
	System.out.println("�������뵱ǰ��Ʒ�۸�");
	double price = sc.nextDouble();
	if (price >= 0){
			if (grade){
				if (price < 200){
					System.out.println("�����Żݺ�۸�Ϊ��"+(price*0.8)+"Ԫ");
					}
				else {
					System.out.println("�������Żݺ�۸�Ϊ��"+(price*0.75)+"Ԫ");
					}
				}
			else {
				if (price > 100){
					System.out.println("�����Żݺ�۸�Ϊ��"+(price*0.9)+"Ԫ");
					}
				else {
					System.out.println("���������Ǳ����Ա�������Żݣ���۸�Ϊ��"+price+"Ԫ");
					}
				}
		
			}
	else {
		System.out.println("������ļ۸�����");
		}
	}
}