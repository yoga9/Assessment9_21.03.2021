package pack1;
import java.util.*;

public class Enum_WeekEg {

	enum Days{
       SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY		
	}
	
	public static void main(String[] args) {
		
		EnumSet<Days> set1, set2, set3;
		
	    set1 = EnumSet.allOf(Days.class);
		System.out.println("Whole Days : "+set1);
		
	    set2 = EnumSet.of(Days.SUNDAY, Days.SATURDAY);
		System.out.println("Weekend Days : "+set2);
		
	    set3 = EnumSet.complementOf(set2);
		System.out.println("Week Days : "+set3);           //WeekDays - 1
		
		set3 = EnumSet.range(Days.MONDAY, Days.FRIDAY);    //WeekDays -2
		System.out.println("Week Days : "+set3);
		
 }
}
