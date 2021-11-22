import java.util.Random;
public class Main {
	public static void showClasses(Class classrooms[]) {
		System.out.println("LIST OF ALL CLASSES");
		for(int i=0;i<(classrooms.length);i++) {
			System.out.println(classrooms[i].toString());
		}
	}
	public static void showTeachers(Teacher teachers[]) {
		System.out.println("LIST OF ALL TEACHERS");
		for(int i=0;i<(teachers.length);i++) {
			System.out.println(teachers[i].fullToString());
		}
	}
	public static String findClass(int id,Class classrooms[]) {
		int i=0;
		for(i=0;i<(classrooms.length);i++) {
			if(id==(classrooms[i].idClass)){
				break;
			}
		}
		return classrooms[i].toString();
	}
	public static void findTeacher(int id,Teacher teachers[],Subject subjects[]) {
		int teacherIndex=0;
		String tempSubject="";
		for(int i=0;i<(teachers.length);i++) {
			if(id==(teachers[i].idTeacher)){
				teacherIndex=i;
				//System.out.println(teachers[teacherIndex].toString());
			}
		}
		for(int i=0;i<(subjects.length);i++) {
			if(subjects[i].idSubject==(teachers[teacherIndex].getSubject())){
				tempSubject=subjects[i].getName();
				//System.out.println(tempSubject);
				break;
			}
		}
		System.out.println("SUBJECT: "+tempSubject+"\t\t\tTEACHER: "+teachers[teacherIndex].toString());
	}
	public static void main(String[] args) {
		//schooltimetable objects manage the one-week timetable of a single class
		//SchoolTimeTable class1;
		//SchoolTimeTable class2;
		SchoolTimeTable classes[]=new SchoolTimeTable[2];
		//class,teacher and subject objects contains the information those types of data
		Class classrooms[]=new Class[2];
		Teacher teachers[]=new Teacher[4];
		Subject subjects[]=new Subject[4];
		//temp matrices contain the id of teachers of the classes 
		int temp1[][]= {{1,2,3,4},{2,3,4,1},{3,4,1,2},{4,1,2,3}};
		int temp2[][]={{4,3,2,1},{1,4,3,2},{2,1,4,3},{3,2,1,4}};
		//instantiation of object arrays and the Schooltimetable objects
		String tempNames[]= {"Giorgio","Viola","Matteo","Giacomo","Bianca","Lorenzo","Veronica","Giorgia","Mario","Alessandro","Francesco","Francesca","Luca","Simone","Sara","Alberto","Federico","Luigi","Massimo","Walter","Marta","Alex"};
		String tempSurnames[]= {"Bianchi","Rossi","Verdi","Ferrari","Romano","Fontana","Russo","Costa","Colombo","Greco","Sanna","Barbieri","De Angelis","Esposito","Moro","Sorrentino","Basso","Caruso","De Rosa","Giordano","Mariani","Venturi"};
		String tempPhone[]= {"3313563810","3391235075","3370157296","3321205739","3381038482","3351045622","3345756039","3318674235","3327650375","3391453895","3371234567","3399876543","3323456123"};
		String tempCourses[]= {"Informatics","Microbiology","Telecomunications","Electronics","Mechanics"};
		String tempSubjects[]= {"Mathematics","Literature","English","Marketing","Turism  ","Finance","Graphics","Chemistry","Materials","Biology","Agricolture","Environment","Biotechnology"};
		int tempYears[]= {1,2,3,4,5};
		char tempSections[]= {'A','B','C','D','E','F','G','H'};
		for(int i=0;i<(subjects.length);i++) {
			subjects[i]=new Subject(tempSubjects[new Random().nextInt(tempSubjects.length)]);
		}
		for(int i=0;i<(classrooms.length);i++) {
			classrooms[i]=new Class(tempYears[new Random().nextInt(tempYears.length)],tempSections[new Random().nextInt(tempSections.length)],tempCourses[new Random().nextInt(tempCourses.length)]);
		}
		for(int i=0;i<(teachers.length);i++) {
			teachers[i]=new Teacher(tempNames[new Random().nextInt(tempNames.length)],tempSurnames[new Random().nextInt(tempSurnames.length)],tempPhone[new Random().nextInt(tempPhone.length)],subjects[i].idSubject);
		}
		//class1=new SchoolTimeTable(classrooms[0].idClass,temp1);
		//class2=new SchoolTimeTable(classrooms[1].idClass,temp2);
		for(int i=0;i<2;i++) {
			classes[i]=new SchoolTimeTable(classrooms[i].idClass,temp1);
		}
		//these methods show all teachers and classes 
		showClasses(classrooms);
		System.out.print("\n\n");
		showTeachers(teachers);
		System.out.print("\n\n\n\n");
		//show the weekly timetables of class1 and class2
		System.out.println("WEEKLY TIMETABLE OF CLASS "+findClass(classes[0].getClassroom(),classrooms)+"\n");
		for(int i=0;i<(temp1.length);i++) {
			System.out.println(Day.getDay(i));
			for(int j=0;j<(temp1[0].length);j++) {
				//System.out.print("test\n");
				findTeacher(classes[0].getTeacher(i,j),teachers,subjects);
			}
			System.out.print("\n");
		}
	}
}