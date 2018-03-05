package DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDifferenceWithBirthday {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter birthday : ");
		int birth =sc.nextInt();*/
		LocalDate bday = LocalDate.parse("1993-03-25") ;
		LocalDate now = LocalDate.now();
		Period difference =Period.between(now, bday);
		System.out.println("Age => " + difference);
	}

}
