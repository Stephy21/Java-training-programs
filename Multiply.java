import java.util.Scanner;
class Multiply{
	public static void main(String[] args) {
		Multiply mul=new Multiply();
		int num1=mul.input();
		int num2=mul.input();
		System.out.println(mul.multi(num1,num2));
	}
	int input(){
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number:");
		int num1=scan.nextInt();
		return num1;
		
	}
	int multi(int num1,int num2){
		return num1*num2;
	}
}