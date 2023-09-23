
package Model;

public class Student implements Comparable<Student> {
	private String id;
	private String studentName;
	private String semester;
	private String courseName;

	public Student() {
	}

	public Student(String id, String studentName, String semester, String courseName) {
		this.id = id;
		this.studentName = studentName;
		this.courseName = courseName;
		this.semester = semester;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}
	
	@Override
        public int compareTo(Student t) {
        return t.studentName.compareTo(this.studentName);
    }

	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", studentName=" + studentName + ", courseName=" + courseName + ", semester=" + semester + '}';
	}
	
	public void print() {
        System.out.printf("%-15s%-15s%-15s\n", studentName, semester, courseName);
    }
}
