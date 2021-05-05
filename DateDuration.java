import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
class DateDuration{
	public static void main(String[] args) {
		DateDuration d = new DateDuration();
		d.Date1();

	}
	void Date1(){
		System.out.println("enter a date : dd/mm/yyyy ");
		Scanner scan= new Scanner(System.in);
		String date = scan.next();
		String[] split = date.split("/");
		int dd = Integer.parseInt(split[0]);
		int mm = Integer.parseInt(split[1]);
		int yyyy = Integer.parseInt(split[2]);
		LocalDate dl =LocalDate.of(yyyy,mm,dd);
		LocalDate now = LocalDate.now();
		Period p = Period.between(dl,now);
		System.out.println(p.getYears()+"years");
		System.out.println(p.getMonths()+"months");
		System.out.println(p.getDays()+"days");
	}
}