import java.util.Scanner;
class PositiveString{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string : ");
		String str = scan.nextLine();
		PositiveString ps = new PositiveString();
		boolean check = ps.check(str);
		System.out.println(check);

	}
	boolean check(String str){
		int flag = 1;
		for(int i=0;i<str.length()-1;i++){
			int comp = Character.compare(str.charAt(i),str.charAt(i+1));
			if(comp>0){
				flag = 0;
				break;
			}
		}
		if(flag == 1){
			return true;
		}
		else{
			return false;
		}
	}
}