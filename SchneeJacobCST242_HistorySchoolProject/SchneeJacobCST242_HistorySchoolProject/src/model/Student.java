package model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person  implements Serializable{
	//Next Objective get the method to get credits (Done)
	
	//Idea, when wecreate the student, lets show in the output the id to specify the student. OR maybe a popup
	//Another idea, using the sanner to read the file.... for ids.
	private double gpa;
	private courseBag studentBag;
	private MasterCourseBag mcb;
	private int credits;
	
	//different - we may get rid of this in the future, ifits obsolete
	private ArrayList<Course> courseTook;
	private ArrayList<Course> courseTotake;
	private ArrayList<Course> courseTake;

	//public Student(String fName, String lName, Address address, String[] coursesTook, String[] coursesTaking,
			//String[] coursesToTake, courseBag studentBag) {	//coursEBag studentBag 
/*	public Student(String fName, String lName, Address address, courseBag studentBag){

		super(fName, lName, address);
		this.coursesTook = coursesTook;
		this.coursesTaking = coursesTaking;
		this.coursesToTake = coursesToTake;
	}*/
	
	//public Student(String fName, String lName, Address address, courseBag studentBag, ArrayList<Course> courseTook,
			//ArrayList<Course> courseTotake, ArrayList<Course> courseTake) {
		public Student(String fName, String lName, Address address, courseBag studentBag){
		super(fName, lName, address);
		this.gpa = gpa;
		this.courseTook = courseTook;
		this.courseTotake = courseTotake;
		this.courseTake = courseTake;
		this.studentBag = studentBag;
		this.credits = getCredits();

		//this.credits = 
	}
	


	public ArrayList<Course> getCourseTook() {
		return studentBag.getCoursesTook();
	}
	
	
	public void setCourseTook(ArrayList<Course> courseTook) {
		this.courseTook = courseTook;
	}

	public ArrayList<Course> getCourseTotake() {
		//return courseTotake;
		return studentBag.getCoursesToTake();
	}

	public void setCourseTotake(ArrayList<Course> courseTotake) {
		this.courseTotake = courseTotake;
	}

	public ArrayList<Course> getCourseTake() {
		//return courseTake;
		return studentBag.getCoursesTaking();
	}

	public void setCourseTake(ArrayList<Course> courseTake) {
		this.courseTake = courseTake;
	}
//End of Line ArraYList
	
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public int getCredits(){
		ArrayList<Course> courseTaking = getCourseTake();
		ArrayList<String> stringList = new ArrayList<>();
		int total = 0;
		for(Course c: courseTaking){
			stringList.add(c != null ?  c.toString() : null);
			
		}
		/*for(int i = 0; i < stringList.size(); i++){
		}*/
		
		for(Course c: courseTaking){
			total += c.getCredits();
		}
		//System.out.println(stringList);
		//System.out.println(total);
		return total;
	}



	public courseBag getStudentBag() {
		return studentBag;
	}


/*
	public String getId(){
//		getId();
	}*/
	//@Override
	public String toString() {
		return "Student: " +  "Id = " + getId() +  "\n" + "First Name = " + getfName() + ", Last Name = " + getlName() + "\n" + "Address = " + getAddress()
				 + "\n" + "Courses Took: \n" + getCourseTook() + "\n" + "Courses To Take: \n"
				+ getCourseTotake() + "\n" + "Courses Currently Taking: \n" + getCourseTake() + "\nCredits Currently Taking = " + getCredits() + "\n";
	}

/*	@Override
		public String toString() {
			return "Student: " +  "Id = " + getId() +  "\n" + "First Name = " + getfName() + ", Last Name = " + getlName() + "\n" 
		+ "Address = " + getAddress() + "\nCredits Currently Taking = " + getCredits() + "\n" +  "\n";	//What i can do is have the coruses display from the sbag, along with the Student info
	*/
	/*public String[] getCoursesTook() {
		return studentBag.getCourseTook();
	}
	public String[] getCoursesTaking() {
		return studentBag.getCourseTaking();
	}
	public String[] getCoursesToTake() {
		return studentBag.getCourseToTake();
	}
*/
	
	
/*	@Override
	public String toString() {
		return "Student [getId()=" + getId() + ", getfName()=" + getfName() + ", getlName()=" + getlName()
				+ ", getAddress()=" + getAddress() + ", courseTook=" + courseTook + ", courseTotake=" + courseTotake
				+ ", courseTake=" + courseTake + "]";
	}*/

	


	

	
	}
	


