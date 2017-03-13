package model;
//Lets get rid of PErson and just two arrayList for STudent And Faculty
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//add method w/ fac and student, check delete then display, maybe update. see if they work in unison
public class BodyBag {

	private ArrayList<Person> personList = new ArrayList<>();

	//private ArrayList<Student> studentList = new ArrayList<>();
	//private ArrayList<Faculty> facultyList = new ArrayList<>();

	public void addPerson(Person p) {
		personList.add(p);


	}

	public void displayBodyBag() {
		for (Person p : personList) {
			System.out.println(p);
		}
	}

	/*
	 * public Faculty findFaculty(String id){ for(Faculty f : facultyList){
	 * if(f.getId().equals(id)){ return f; } } return null; }
	 */

	public Person deletePerson(String id) {
		
		
		int counter = 0;
		for (Person p : personList) {
			if (p.getId().equals(id))
				break;
			counter++;
		}
		if (counter < personList.size()) {
			return personList.remove(counter);

		}
		return null;

	}

	public Person findByID(String id) {
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getId().equals(id)) {
				return personList.get(i);
			}
		}
		return null;
	}

	public void save() {
		try {
			FileOutputStream fos = new FileOutputStream("BodyBag.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(personList);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void load() {
		try {
			FileInputStream fis = new FileInputStream("BodyBag.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			personList = (ArrayList<Person>) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/*public Student findbyId(String id) {
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId().equals(id)) {
				return studentList.get(i);
			}

		}
		return null;
	}*/

	//Key is to use the update everytime.
	/*public void newLists() {
		studentList.clear();
		facultyList.clear();
		for (Person p : personList) {
			// facultyList.add((Faculty) s);
			///studentList.clear();
			//facultyList.clear();
			if (p instanceof Student) {
				//System.out.println("This is a Student: " + p);
				
				 studentList.add((Student) p);
			}
			if (p instanceof Faculty) {
				
				//System.out.println("This is a Faculty: " + p);
				facultyList.add((Faculty) p);
			} 
			
		}
	}*/
	public void displayStudent(){
		for(Person s: personList)
			if(s instanceof Student){
				System.out.println(s);
			}
	}
	
	public void displayFaculty(){
		for(Person f: personList){
			if(f instanceof Faculty){
				System.out.println(f);
			}
		}
	}
	
	/*public void displayFaculty(){
		for(Faculty f: facultyList){
			System.out.println(f);
		}
	}*/
	
	/*public Student findbyId1(String id){
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId().equals(id)) {
				return studentList.get(i);
			}
			
		}
		return null;
	}*/
	public Student findStudentById(String id){
		for(Person p: personList){
			if(p.getId().equals(id) && p instanceof Student)
				return (Student) p;
		}
		return null;
	}
	//Could also try Faculty as well - 3/12
	

	public ArrayList<Person> getPersonList() {
		return personList;
	}

	

}