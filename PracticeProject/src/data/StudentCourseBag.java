package data;
import java.io.Serializable;
import java.util.ArrayList;
//Connection is the mcb.find

//Connection to Student and CourseBag


//Becareful we need to watch out, for the displays. Do we need them? Each student gets a bag.

//Thats RIGHT STRING, I FORGOT ABOUT THE STRING

//Possible in the future, we should do advance searchs, may be with name, or dispaly courses with that many credits
public class StudentCourseBag implements Serializable {
	
	private ArrayList<Course> coursesTaking = new ArrayList<>();
	private ArrayList<Course> coursesToTake = new ArrayList<>();
	private ArrayList<Course> coursesTook = new ArrayList<>();
	
	
public StudentCourseBag() {
		super();
		this.coursesTaking = coursesTaking;
		this.coursesToTake = coursesToTake;
		this.coursesTook = coursesTook;
	}

public StudentCourseBag(StudentCourseBag cb){
	this.coursesTaking = cb.getCoursesTaking();
	this.coursesTook = cb.getCoursesTook();
	this.coursesToTake = cb.getCoursesToTake();
}

//	private ArrayList<MasterCourseBag> course = new ArrayList<>();
	//MasterCourseBag mcb = new MasterCourseBag();
	/*private String[] a = coursesTook.toArray(new String[coursesTook.size()]);
	private String[] b = coursesToTake.toArray(new String[coursesToTake.size()]);
	private String[] c = coursesTaking.toArray(new String[coursesTaking.size()]);
	
	private String[] d = new String[coursesTaking.size()];*/

	
	public void addCoursesTaking(Course c){
		coursesTaking.add(c);
		// mcb.getCourseList();
		/*System.out.println(crn);
		System.out.println(mcb.findCourse(crn));*/
		/*if(mcb.findCourse(crn).equals(crn)){
				//coursesTaking.add(mcb.findCourse(crn));
			System.out.println("Course Found!");
			}else {
				System.out.println("Course " + crn + " could not be found");
			}*/
	}
	
	
	/*public Course findCourses(Course c){
		if(c.getCourseNumber().equals(coursesTaking.g))
	}
	*/
	public Course findCourseTaking(String crn){
		for(Course c: coursesTaking){
			if(c.getCourseNumber().equals(crn)){
				System.out.println("CourseTaking: " + c);
				return c;
			}else{
				System.out.println(crn + " could not be found");
			}
		
		}
		return null;
		
	}
	
	/*public courseBag findCourseTaking(Course a){
		coursesTaking.
		return null;
		
	}
	*/

	//We can change that to STring crn, because we only need the add for Course, once its inside the arrayList
/*	public void deleteCourseTaking(Course c){
		System.out.println("Deleting course");
		coursesTaking.remove(c);
	}*/
	
	/*public Course deleteCourseTakingById(String id){
		int counter = 0;
		for(Course c: coursesTaking){
			if(c.getCourseNumber().equals(id))
				break;
				counter++;
			if(counter < coursesTaking.size()){
				return coursesTaking.remove(counter);
			}
		}
		return null;*/
		
	/*	int counter = 0;
		for(Course c: coursesTaking){
			if(c.getCourseNumber().equals(id)){
				counter++;
		}
			if(counter < coursesTaking.size()){
				return coursesTaking.remove(counter);
			}
		}
		return null;*/
	//}
	
	public void displayCourseTaking(){
		for(Course c : coursesTaking){
			System.out.println("Courses Taking: " + c);
		}
	}
	
	//Took
	public void addCoursesTook(Course c){
		coursesTook.add(c);
	}
	
	public void displayCoursesTook(){
		for(Course c : coursesTook){
			System.out.println("Courses Took: " + c);
		}
	}
	
	public Course findCourseTook(String crn){
		for(Course c : coursesTook){
			if(c.getCourseNumber().equals(crn)){
				return c;
			}
		}
		return null;
		
	}
/*	public Course deleteCourseTook(String crn){
		int counter = 0;
		for(Course c : coursesTook){
			if(c.getCourseNumber().equals(crn)){
				break;
			}
			counter++;
			if(counter < coursesTook.size()){
				return coursesTook.remove(counter);
			}else{
				System.out.println("CourseTook " + crn + " could not be found");
			}
		}
		return null;
		
	}
	*/
/*	public Course deletecourseTook(Course c){
		return coursesTook.remove(c);
	}*/
	
	
	/*
	//ToTake
	public void deleteCourseToTake(Course c){
		System.out.println("Deleting course");
		coursesToTake.remove(c);
	}*/
	
	//Took
	public void addCoursesToTake(Course c){
		coursesToTake.add(c);
	}
	
	public void displayCoursesToTake(){
		for(Course c : coursesToTake){
			System.out.println("Courses To Take: " + c);
		}
	}
	
	public Course findCourseToTake(String crn){
		for(Course c : coursesToTake){
			if(c.getCourseNumber().equals(crn)){
				return c;
			}
		}
		return null;
		
	}
	/*public Course deleteCourseToTake(String crn){
		int counter = 0;
		for(Course c : coursesToTake){
			if(c.getCourseNumber().equals(crn)){
				break;
			}
			counter++;
			if(counter < coursesToTake.size()){
				return coursesToTake.remove(counter);
			}else{
				System.out.println("coursesToTake " + crn + " could not be found");
			}
		}
		return null;
		
	}*/
	
	
	//RIGHT NOW WE - 3/7, NEED TO FIX THE DELETE METHODS. RIGHT NOW THEY'RE NOT WORKING. I have avoid, that works.
	public Course deleteCourseTakingv2(String crn){
		int ocunter = 0;
		for(Course c : coursesTaking){
			if(c.getCourseNumber().equals(crn)){
				break;
			}
			ocunter++;
		}if(ocunter < coursesTaking.size())
			return coursesTaking.remove(ocunter);
		return null;
	}
	
	
	public Course deleteCourseTookv2(String crn){
		int ocunter = 0;
		for(Course c : coursesTook){
			if(c.getCourseNumber().equals(crn)){
				break;
			}
			ocunter++;
		}if(ocunter < coursesTook.size())
			return coursesTook.remove(ocunter);
		return null;
	}
	
	public Course deleteCourseToTakev2(String crn){
		int ocunter = 0;
		for(Course c : coursesToTake){
			if(c.getCourseNumber().equals(crn)){
				break;
			}
			ocunter++;
		}if(ocunter < coursesToTake.size())
			return coursesToTake.remove(ocunter);
		return null;
	}
	
	
	
	
	//Well need student id for each one
	//Well do individual, as well as whole/
	public void displayStudentCourseBag(){
		for(Course c : coursesTaking){
			System.out.println("Courses Taking: " + c);
		}
		for(Course c : coursesToTake)
			System.out.println("Course To Take: " + c);
		for(Course c : coursesTook)
			System.out.println("Courses Took: " + c);
		
	}


	public ArrayList<Course> getCoursesTaking() {
		return coursesTaking;
	}
	
	public int getCoursesTakingSize() {
		return coursesTaking.size();
	}

	public ArrayList<Course> getCoursesToTake() {
		return coursesToTake;
	}


	public ArrayList<Course> getCoursesTook() {
		return coursesTook;
	}
	
	//Well do array's here
/*	public String[] getCourseTook(){
		return a;
	}
	public String gettCourseTaking(){
		System.out.println("Hello");
		return c.toString();
	}
	
	public String[] getCourseToTake(){
		return b;
	}
	
	public String[] getCourseTaking(){
		return c;
	}
	
	
*/

	/*public void displayCourses(){
		mcb.displayCourse();
	}
	*/
	
	
	

}
