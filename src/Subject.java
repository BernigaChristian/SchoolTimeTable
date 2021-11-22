
public class Subject {
	public final int idSubject;
	private String name;
	private static int registered=0;
	//constructors
	public Subject(String name) {
		this.name=name;
		idSubject=++registered;
	}
	//getters
	public String getName() {
		return this.name;
	}
	//setters
	public void setName(String name) {
		this.name=name;
	}
	//methods
	
}
