package data;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Add all courses to
public class MasterCourseBag {
	
	ArrayList<Course> courseList = new ArrayList<>();
	
	public void addCourse(Course c){
		courseList.add(c);
	}
	
	public void displayCourse(){
		for(Course c : courseList)
		System.out.println(c);
	}
	
	public Course findCourse(String courseNumber){
		for(Course c: courseList){
			if(c.getCourseNumber().equals(courseNumber))
					return c;
		}
		System.out.println(courseNumber + " could not be found");
		return null;
	}
	
	public Course deleteCourse(String courseNumber){
		int counter = 0;	
		for(Course c: courseList){
				if(c.getCourseNumber().equals(courseNumber)){
					break;
				}
				counter++;
		}	if(counter < courseList.size()){
			return courseList.remove(counter);
		}

		return null;
	}
	
	public void saveCourse(){
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("MasterCourse.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(courseList);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadCourse(){
		FileInputStream fis;
		try {
			fis = new FileInputStream("MasterCourse.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			courseList = (ArrayList<Course>)ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Course> getCourseList() {
		return courseList;
	}
	
	

}
