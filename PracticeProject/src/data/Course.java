package data;
import java.io.Serializable;
//3-21-17
//We will need to modify this to accomodate the TextBook Class

public class Course implements Serializable {
	private String courseNumber;
	private String courseName;
	private int credits;
	private TextBook textBook;
	//private String grade; // A+, a, B+, B
//Grade is for the specific student, we may add that at a later point
	public Course(String courseNumber, String courseName, int credits, TextBook textBook) {
		this.courseNumber = courseNumber;
		this.courseName = courseName;
		this.credits = credits;
		this.textBook =textBook;
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



	public TextBook getTextBook() {
		return textBook;
	}

	public void setTextBook(TextBook textBook) {
		this.textBook = textBook;
	}

	@Override
	public String toString() {
		return "Course: CourseNumber = " + courseNumber + ", CourseName = " + courseName + ", Credits = " + credits
				+ " \nTextBook: " + textBook;
	}

}