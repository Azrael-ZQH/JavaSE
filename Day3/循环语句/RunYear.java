public class RunYear{
	public static void main(String[] args){
		//for ѭ��
		for(int i=1998;i<=2019;i++){
			if(i%4==0&&i%100!=0||i%400==0){
				System.out.println(i);
			}
		}

		System.out.println();
		//whileѭ��
		int i=1998;
		while(i<=2019){
			if(i%4==0&&i%100!=0||i%400==0){
				System.out.println(i);
			}
			i++;
		}
	}
}