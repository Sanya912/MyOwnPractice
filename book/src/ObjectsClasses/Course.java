package ObjectsClasses;

public class Course {
	String CourseName;
	String [] students = new String[10];
	int numberOfStudents;
	
	void addStudent (String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	String [] getStudents() {
		return students;
	}
	int getNumberOfStdents() {
		return numberOfStudents;
	}
	
	String getCCourseName() {
		return CourseName;
	}
	
	
	

	public static void main(String[] args) {
Course ob = new Course();
Course ob1 = new Course();
ob.addStudent("Gosha");
ob.addStudent("Kemba");
ob.addStudent("sha");
ob.addStudent("Kia");
int num = ob.getNumberOfStdents();
System.out.println(ob.getNumberOfStdents());
for(int i =0; i<num; i++) {
	System.out.println(" Name: " + ob.students[i]);
}
	}

}
