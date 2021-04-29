import java.util.Scanner;
class Fibonacci{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of terms required:");
		int num=scan.nextInt();
		int n=0;
		int n2=1;
		int n3;
		System.out.println(n);
		System.out.println(n2);
		for(int i=2;i<num;i++){
			n3=n+n2;
			System.out.println(n3);
			n=n2;
			n2=n3;
		}

	}
}