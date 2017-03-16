//Course Name and Course Number two different Things
//Course Number - CST111
//Course Name - Basic Java Programming
package model;
import java.io.Serializable;

import javax.swing.JOptionPane;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Course implements Serializable {
	private String courseNumber;
	private String courseName;
	private int credits;
	//private String grade; // A+, a, B+, B
//Grade is for the specific student, we may add that at a later point
	public Course(String courseNumber, String courseName, int credits)  {
		
		//Exception handling will be.
		//CourseNumber - Number and letters, but check Suffolk Curse availability for that.
		
			//What about an Array[] that holds it. We need to ignore whitepaces it. So look into that.
		//Course Name - Needs to be Five
/*		for (int i = 0; i < courseName.length(); i++) {
			if (Character.isDigit(courseName.charAt(i)))
				try {
					throw new CourseNameException("Error digit");
				} catch (CourseNameException e) {
					courseName = JOptionPane.showInputDialog("New Name! " );
					System.out.println(courseName);
				}
		
		}*/
	
		
		
		
		//This works
	/*	while (true) {
			//Credits - Numbers of course
			if (credits < 1 || credits > 4) {
				try {
					throw new CreditsException("Error Credit amount");
				} catch (CreditsException e) {
					System.out.println("Your Credits must be between 1-4");

					String strCredits;
					strCredits = JOptionPane.showInputDialog("Enter Correct amount of Credits");
					for(int i = 0; i < strCredits.length(); i++)
						if(!Character.isDigit(strCredits.charAt(i)))
							strCredits = JOptionPane.showInputDialog("Enter Correct amount of Credits (There was a letter)");
						else{
							credits = Integer.parseInt(strCredits);
						}
					
				}
			} else{
				break;
			}
		}*/
		
	
		
		/*	while(true){
			if(!Character.isDigit(credits)){
				String strCredits;
				strCredits = JOptionPane.showInputDialog("Enter Correct amount of Credits");
				credits = Integer.parseInt(strCredits);
				}else{		
				
			break;
				}
		}
		*/
		
		
		
		/*while(true){	//if(Character.isDigit(courseName.charAt(i))){
		for(int i = 0; i < courseName.length(); i++) {	  
			if(!Character.isLetter(courseName.charAt(i))){
				System.out.println("Hello");
				try {
					throw new CourseNameException("Error: The course name is not all letter characters");
				} catch (CourseNameException e) {
					courseName = JOptionPane.showInputDialog(e.getMessage() + "\nEnter a correct Course Name");
					
				}
			} else {
				//break;
			}
		
		}*/
		
		
		
		
		
		
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