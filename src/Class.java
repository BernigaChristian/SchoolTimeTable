
public class Class {
	public  final int idClass;
	private int year;
	private char section;
	private String course;
	private static int registered=0;
	//constructors
	public Class(int year,char section,String course) {
		this.year=year;
		this.section=section;
		this.course=course;
		idClass=++registered;
	}
	//getters
	public int getYear() {
		return this.year;
	}
	public char getSection() {
		return this.section;
	}
	public String getCourse() {
		return this.course;
	}
	//setters
	public void setYear(int year) {
		this.year=year;
	}
	public void setSection(char section) {
		this.section=section;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	//methods
	public String toString() {
		return year+" "+section+" "+course;
	}
}
