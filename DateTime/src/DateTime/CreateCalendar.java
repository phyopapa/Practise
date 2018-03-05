package DateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class CreateCalendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int y =sc.nextInt();
		System.out.println("Enter the month : ");
		int m = sc.nextInt();
		
		int[][] day = new int[6][7];
		LocalDate temp;
		LocalDate loc = LocalDate.of(y, m, 1);
		/*for(int i=1; i<=6 ;i++){
			for(int j=1;j<=7;j++){
				for(int k=1;k<=loc.getDayOfMonth();k++){				
					loc.getDayOfWeek();
					temp = loc.of(y, m, i);
					//day[i][j] = 
				}	
			}		
		}*/
		
	}

}
