/* 
this program was assigned for my beginner java class the goal of this program is to ask the user
for the start date of the class and what month */
import java.util.*;

public class AttendanceCalendarMaker{
	public static void main (String [] args){
		int month = 0;
		int date = 0;
		int year = 0;
		int meetings = 0;
		char dayWeek = 'M';
		Scanner kb = new Scanner(System.in);

		//Ask for the values for the calendar
		while (!(month == 1 || month == 8)){
			System.out.print("Please enter the starting month (8-Aug or 1-Jan): ");
			month = kb.nextInt();
			if (!(month == 1 || month == 8)){
				System.out.println("Semesters begin in either August (8) or January (1)");
			}
		}
		while (!(date>=1 && date<=31)){
			System.out.print("Please enter the date of the first class (1..31): ");
			date = kb.nextInt();
			if (!(date>=1 && date<=31)){
				System.out.println("Dates begin between 1st (1) and 31st (31)");
			}
		}
		while (!(year>=1 && year<=3000)){
			System.out.print("Please enter the year of the semster: ");
			year = kb.nextInt();
			if (!(year>=1 && year<=3000)){
				System.out.println("Please enter the correct year for the semester");
			}
		}
		while (!(meetings>=2 && meetings<=5)){
			System.out.print("Please enter how many meeting a week your class will have: ");
			meetings = kb.nextInt();
			if (!(meetings>=2 && meetings<=5)){
				System.out.println("Meetings per week are either 2 (2), 3 (3), 4 (4), or 5 (5)");
			}
		}
		//End of asking for the values for the calendar
		if (meetings == 2){
			dayWeek = 'T';
		}
		ClassDay calendar = new ClassDay(month, date, year, dayWeek, meetings);
		String top = calendar.topBar(meetings);
      System.out.print(top);
		int i = 1;
		while(i<17){
			System.out.println();
         System.out.print(i);
			for (int w = 0; w < meetings; w++)
				System.out.print( calendar );
      i++;
		}
	}
}
