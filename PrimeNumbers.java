import java.util.Scanner;
class PrimeNumbers{
	public static void main(String[] args) {
		Prime pm = new Prime();
		pm.input();

	}
}
class Prime{
	void input(){
		System.out.println("enter an integer : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		find(num);
	}
	void find(int number){
		int flag;
		for(int i = 1; i<=number; i++){
			if(i == 1 || i == 0){
				continue;
			}
			flag = 1;
			for(int j = 2; j <= i/2; ++j){
				if(i%j == 0){
					flag = 0;
					break;
				}
			}
		if(flag == 1)	
		{System.out.println(" "+i);}
		}
	}
}
