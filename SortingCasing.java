import java.util.Scanner;
import java.util.Arrays;
class SortingCasing{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number of elements :");
		int len = scan.nextInt();
		System.out.println("Enter the array of strings :");
		String[] arr = new String[len];
		for(int i = 0; i<len; i++){
			arr[i] = scan.next();
		}
		SortingCasing sc = new SortingCasing();
		String[] result = sc.sortcase(arr);
		//System.out.println(Arrays.toString(result));
	}
	String[] sortcase(String[] arr){
		Arrays.sort(arr);
		for(String s: arr){
			if(s.length()%2==0){
				s = s.substring(0,s.length()/2).toUpperCase()+s.substring((s.length()/2)).toLowerCase();
				System.out.println(s);
			}
			else{
				s = s.substring(0,(s.length()/2)+1).toUpperCase()+s.substring((s.length()/2)+1).toLowerCase();
				System.out.println(s);
			}
		}
		return arr;
	}
}