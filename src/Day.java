
public class Day {
	public static String getDay(int id) {
		id++;
		switch(id) {
		case 1: return "MONDAY";
		case 2: return "TUESDAY";
		case 3: return "WEDNESDAY";
		case 4: return "THURSDAY";
		case 5: return "FRIDAY";
		case 6: return "SATURDAY";
		default: return "SUNDAY";
		}
	}
	
	
}