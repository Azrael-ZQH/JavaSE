public class Train1{
	public static void main(String[] args){
		int newPhone = 7988;
		int oldPhone = 1500;
		double change = newPhone*0.8;
		double exchange = newPhone-oldPhone;
		if (change<exchange){
			System.out.println("��Ҫ�Ծɻ��£���۸�Ϊ"+change+"Ԫ");
		}
		else {
			System.out.println("����Ҫ�Ծɻ��£���۸�Ϊ"+exchange+"Ԫ");
			}
	}
}