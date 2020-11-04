package homework3;

public class TestCourse{
	public static void main(String[]args) throws CloneNotSupportedException {
		
		//新建course1对象
		Course course1 = new Course("Data Structures");
		
		//分别加入名字
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		
		//克隆course1得到course2
		Course course2 = (Course)course1.clone();
		
		//course1信息
		System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
		String[]students1 = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.print(students1[i] + "，");
		}
		System.out.println();
		
		//course2信息
		System.out.println("Number of students in course1: " + course2.getNumberOfStudents());
		String[]students2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++) {
			System.out.print(students2[i] + "，");
		}
		System.out.println();

		//判断是否为深复制
		System.out.println();
		System.out.println(course1==course2);
		System.out.println(course1.getCourseName()==course2.getCourseName());
		System.out.println(course1.getStudents()==course2.getStudents());

	}
}

class Course implements Cloneable {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students [numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		for(int i = 0; i < numberOfStudents; i++) {
			if(students[i] == student) {
				for(int j = i+1; j < numberOfStudents+1; j++) {
					students[j-1] = students[j];
					numberOfStudents--;
				}
			}
		}
	}
	
	public Object clone() throws CloneNotSupportedException {
		//浅复制
		Course courseClone = (Course)super.clone();
		//深复制
		courseClone.students = (String[])(students.clone());
		return courseClone;
	}
}
