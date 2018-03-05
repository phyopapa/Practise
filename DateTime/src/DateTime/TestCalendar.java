package DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class TestCalendar {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int year,month;
		System.out.println("Enter the year");
		year = scan.nextInt();
		System.out.println("Enter the month");
		month = scan.nextInt();
		
		int[][] twoD = new int[6][7];
		int row,column;
		DayOfWeek col;
		LocalDate ld = LocalDate.of(year,month,1);
		WeekFields weekFields= WeekFields.of(Locale.getDefault());
		
		for(int i=1;i<=ld.lengthOfMonth();i++){
		
			ld = LocalDate.of(year,month,i);			
			row = ld.get(weekFields.weekOfMonth())-1;			
			col = ld.getDayOfWeek();			
			column = col.getValue();
			
			if(column == 7){//array 0->6 
				column = 0;
			}
			twoD[row][column] = ld.getDayOfMonth();
		}
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		
		for(int i=0;i<twoD.length;i++){
			for(int j=0;j<twoD[i].length;j++){
				if(twoD[i][j]==0){
					System.out.print("\t");
				}
				else
				{
					System.out.print(twoD[i][j]+"\t");
				}
			}
			System.out.println();
		}
		
		
	}
}
