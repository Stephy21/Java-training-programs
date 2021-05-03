import java.util.Scanner;
class CalculateSum{
	public static void main(String[] args) {
		System.out.println("enter the value for n: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		CalculateSum cs = new CalculateSum();
		System.out.println("Sum of first "+n+" natural numbers which are divisible by 3 or 5 :"+cs.calculateSum(n));
	}
	int calculateSum(int n){
		int sum=0;
		for( int j=1; j<=n;j++){
			if(j%3==0 || j%5==0){
				sum+=j;
			}
		}
		return sum;
	}
}