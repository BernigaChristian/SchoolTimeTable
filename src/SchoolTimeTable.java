
public class SchoolTimeTable {
	public final int idSchoolTimetable;
	private int classroom;
	private int[][] teacher=new int[4][4];
	private static int registered=0;
	//constructors
	public SchoolTimeTable(int classroom, int[][] teacher) {
		this.classroom = classroom;
		this.teacher = teacher;
		idSchoolTimetable=++registered;
	}
	//getters
	public int getTeacher(int i,int j) {
		return teacher[i][j];
	}
	public int getClassroom() {
		return classroom;
	}
	//setters
	//methods
	
}
