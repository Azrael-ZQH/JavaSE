public class Season{
	public static void main(String[] args){
		lo:for (int i = 3;i<=12;i++){
			switch (i){
				case 3:
				case 4:
				case 5:
				System.out.print(i);
				if(i==5){
					System.out.print("月为春"+"\t");
				}
				break;
				case 6:
				case 7:
				case 8:
				System.out.print(i);
				if(i==8){
					System.out.print("月为夏"+"\t");
				}
				break;
				case 9:
				case 10:
				case 11:
				System.out.print(i);
				if(i==11){
					System.out.print("月为秋"+"\t");
				}
				break;
				case 12:
				case 1:
				case 2:
				System.out.print(i);
				if(i==12){
					i = 0;
				}
				if(i==2){
					System.out.print("月为冬");
					break lo;
				}
			}
		}
	}
}