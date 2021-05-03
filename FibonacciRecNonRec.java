import java.util.Scanner;
class FibonacciRecNonRec{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value for n for the nth term:");
		int num=scan.nextInt();
		FibonacciRecNonRec fb = new FibonacciRecNonRec();
		System.out.println(num+"th term of fibonacci using recursive method is "+fb.Fibrec(num));
		System.out.print(num+"th term of fibonacci using non recursive method is ");
		fb.FibNonRec(num);
	}
	int Fibrec(int n){
		if(n==0 || n==1){
			return n;
		}
		else{
			return Fibrec(n-1) + Fibrec(n-2);
		}
	}
	void FibNonRec(int num){
		int n=0;
		int n2=1;
		int n3=0;
		if(num == 1 || num==0){
			System.out.println(num);
		}
		for(int i=2;i<=num;i++){
			n3=n+n2;
			n=n2;
			n2=n3;
		}
		System.out.println(n3);
	}
	
}