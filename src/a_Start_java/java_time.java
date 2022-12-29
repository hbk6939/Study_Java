import java.time.*;

public class java_time {
	public static void main(String[] args){
		LocalDate today = LocalDate.now();
		System.out.println("올해는 " + today.getYear() + "년입니다.");
		
		LocalDate otherDay = today.withYear(1982);
		System.out.println("올해는 " + otherDay.getYear() + "년입니다.");
	}
}