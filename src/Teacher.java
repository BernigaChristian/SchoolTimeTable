
public class Teacher {
	public final int idTeacher;
	private String name;
	private String surname;
	private String phoneNumber;
	private String mail;
	private int subject;
	private static int registered=0;
	//constructors
	public Teacher(String name,String surname,String phoneNumber,int subject) {
		this.name=name;
		this.surname=surname;
		this.phoneNumber=phoneNumber;
		this.mail=this.name+"."+this.surname+"@gmail.com";
		this.subject=subject;
		idTeacher=++registered;
	}
	//getters
	public String getName() {
		return this.name;
	}
	public String getSurname() {
		return this.surname;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public String getMail() {
		return this.mail;
	}
	public int getSubject() {
		return this.subject;
	}
	//setters
	public void setName(String name) {
		this.name=name;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public void setMail(String mail) {
		this.mail=mail;
	}
	//methods
	public String toString() {
		return name+" "+surname;
	}
	public String fullToString() {
		return "NAME: "+name+" "+surname+"\tPHONE: "+phoneNumber+"\tMAIL: "+mail;
	}
}
