import java.util.Scanner;
public	class Test0{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//boolean go = true;
		lo:while (true){//go
		System.out.println("����������������");
		System.out.println("��0���˳�");
		int today = sc.nextInt();
		switch (today){
			case 0:
				//go = false;
				System.out.println("��л����ʹ��");
				break lo;
			case 1:
				System.out.println("�׽�����ܲ��ˣ�");
				break;
			case 2:
				System.out.println("�׽������Ӿ�ˣ�");
				break;
			case 3:
				System.out.println("�׽���������ˣ�");
				break;
			case 4:
				System.out.println("�׽���ö��е����ˣ�");
				break;
			case 5:
				System.out.println("�׽����ȭ���ˣ�");
				break;
			case 6:
				System.out.println("�׽������ɽ�ˣ�");
				break;
			case 7:
				System.out.println("�׽���úúó�һ���ˣ�");
				break;
			default :
				System.out.println("���������������");
				break;
			}
		}
	}
}