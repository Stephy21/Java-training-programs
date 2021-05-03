import java.util.Scanner;
class TrafficLight{
	public static void main(String[] args) {
		System.out.println("choose :\n1.red 2.yellow 3.green");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice){
			case 1:
				System.out.println("Stop");
				break;
			case 2:
				System.out.println("get ready");
				break;
			case 3:
			System.out.println("GOOOO!");
			break;
		}
	}
}