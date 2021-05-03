import java.util.Scanner;
import java.util.Arrays;
class ArrayManipulation{
	public static void main(String[] args) {
		System.out.println("enter number of elements :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++){
			arr[i] = scan.nextInt();
		}
		ArrayManipulation ar = new ArrayManipulation();
		int[] result = ar.getSorted(arr);
		for(int j = 0; j< result.length; j++){
			System.out.print(" "+result[j]);
		}
	}
	int[] getSorted(int... values){
		int[] val = new int[values.length];
		for(int i=0;i<values.length;i++){
			String s = Integer.toString(values[i]);
			String reverse = new StringBuffer(s).reverse().toString();
			val[i] = Integer.parseInt(reverse);
		}
		Arrays.sort(val);
		return val;
	}
}