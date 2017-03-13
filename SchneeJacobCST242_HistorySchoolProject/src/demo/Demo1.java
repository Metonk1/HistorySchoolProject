//Demo 1 will be used to finalize our works in the model class.

//Along with incorporating the datainput and output streams, with interfaces like healthcare and stuff. What about faculty have there own bag of course of what they're teaching.
package demo;

import model.Address;
import model.*;

public class Demo1 {

	public static void main(String[] args) {
		BodyBag pBag = new BodyBag();
		courseBag s1Bag = new courseBag();
		courseBag s2Bag = new courseBag();
		MasterCourseBag mcb = new MasterCourseBag();
		
		Address a = new Address("32", "Spooner St.", "Quahog", "Rhode Island", "24125");
		
		Student s1 = new Student("Bill", "Rogers", a, s1Bag);
		//s1.setId("1");
		Student s2 = new Student("Eve", "Michaels", a, s2Bag);
		//s2.setId("2");
		Faculty f1 = new Faculty("Negi", "SpringField", a, "3-a", 5000);
		//f1.setId("3");
		Faculty f2 = new Faculty("Vladimiar", "Dracula" ,a, "blood-2", 10000);
		//f2.setId("4");
		//Add Courses First - Courses
		Course c1 = new Course("1223","Art of War 101", 5);
		Course c2 = new Course("2452", "Fencing 101", 2);
		Course c3 = new Course("5313", "History of India", 4);
		Course c4 = new Course("2156", "World war I (honors)", 10);
		Course c5 = new Course("6257", "Cold War: Russia", 5);
		Course c6 = new Course("1263", "Heroes of the World", 20);
		
		mcb.addCourse(c1);
		mcb.addCourse(c2);
		mcb.addCourse(c3);
		mcb.addCourse(c4);
		mcb.addCourse(c5);
		mcb.addCourse(c6);
		
		//Everything checks out with MastercourseBag 
		/*mcb.displayCourse();
		System.out.println("-----Delete Courses-----");
		mcb.deleteCourse("1223");
		mcb.deleteCourse("6257");
		mcb.displayCourse();
		System.out.println(mcb.findCourse("5313"));*/

		//People Bags
		pBag.addPerson(s1);
		pBag.addPerson(s2);
		pBag.addPerson(f1);
		pBag.addPerson(f2);
		//pBag.newLists();
		//pBag.displayBodyBag();
		//System.out.println(pBag.deletePerson("8"));
		//pBag.deletePerson("3");
		//pBag.deletePerson("2");
		////pBag.displayBodyBag();
		//pBag.newLists();
		//System.out.println("BodyBag");
		//pBag.displayBodyBag();
		//System.out.println("Faculty Display");
		//pBag.displayFaculty();
		//System.out.println("Student Dispaly");
		//pBag.displayStudent();
		System.out.println();
		s1Bag.addCoursesTaking(mcb.findCourse("1223"));
		s1Bag.addCoursesTaking(mcb.findCourse("2452"));
		s1Bag.addCoursesTaking(mcb.findCourse("5313"));
		//s1Bag.addCoursesToTake(mcb.findCourse("2452"));
		//s1Bag.addCoursesTook(mcb.findCourse("5313"));
		
		s2Bag.addCoursesTaking(mcb.findCourse("2156"));
		s2Bag.addCoursesToTake(mcb.findCourse("6257"));
		s2Bag.addCoursesTook(mcb.findCourse("1263"));
		
		//System.out.println(pBag.findStudentById("1"));
		pBag.displayStudent();
		//System.out.println();
		pBag.displayFaculty();
		
		//s1.setfName("DADDY BOBBY HOLA");
		
		/*System.out.println("BodyBag");
				pBag.displayBodyBag();
				System.out.println("Faculty Display");
				pBag.displayFaculty();
				System.out.println("Student Display");
				pBag.displayStudent();*/
		//System.out.println("Find by ID 1 method for STudent");
		//System.out.println(pBag.findbyId1("1"));
		//System.out.println("Find Person");
		//System.out.println(pBag.findFaculty("3"));
		//System.out.println("Trying again: " + pBag.findByID("15"));
	}

}
