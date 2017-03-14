package model;
import java.io.Serializable;

public class Course implements Serializable {
	private String courseNumber;
	private String courseName;
	private int credits;
	//private String grade; // A+, a, B+, B
//Grade is for the specific student, we may add that at a later point
	public Course(String courseNumber, String courseName, int credits) {
		this.courseNumber = courseNumber;
		this.courseName = courseName;
		this.credits = credits;
	}
	
	public Course(){
		
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public Course(Course c){
		this.courseName = c.getCourseName();
		this.courseNumber = c.getCourseNumber();
		this.credits = c.getCredits();
	}
	


	@Override
	public String toString() {
		return "Course Number: " + courseNumber + " Course Name: " + courseName + " Credits: " + credits   ;
	}

}