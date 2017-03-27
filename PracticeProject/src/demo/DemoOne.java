package demo;
import data.Address;
//Control a highlihts everything
import data.BodyBag;
import data.Course;
import data.Faculty;
import data.MasterCourseBag;
import data.Student;
import data.StudentCourseBag;
import data.TextBag;
import data.TextBook;

public class DemoOne {

	public static void main(String[] args) {

		//first we do a basic check of everything then go into TextBooks - modify courses to have it.
		MasterCourseBag mcb = new MasterCourseBag();
		BodyBag pBag = new BodyBag();
		TextBag tBag = new TextBag();

		//2 course bags --> two students
		StudentCourseBag studentBag1 = new StudentCourseBag();
		StudentCourseBag studentBag2 = new StudentCourseBag();
		TextBook t1 = new TextBook("How to be dumb", "Scott brown", "Dumb inc", "3", "2015", 150.00);
		TextBook t2 = new TextBook("Astronony for Idiots", "Peter", "Dumb inc", "2", "2016", 3000.00);
		TextBook t3 = new TextBook("Make A Million Dollars Fast", " Lewis", "Dumb inc", "1", "2002", 541.00);
		tBag.addTextBook(t3);
		tBag.addTextBook(t2);
		tBag.addTextBook(t1);

		//Course Checks - for now until we need to add the Textbooks
		Course c1 = new Course("CST111", "JAVA", 4, tBag.findTextBook("3"));
		Course c2 = new Course("AST101", "Space", 3, t2);
		Course c3 = new Course("PHY131", "Physics I", 4, t3);
		mcb.addCourse(c1);
		mcb.addCourse(c2);
		mcb.addCourse(c3);
		//mcb.displayCourse();
		//mcb.deleteCourse("CST111");
		///mcb.displayCourse();
		//mcb.findCourse("CST111");

		//Students and Faculty
		Address a = new Address("2", "Cabernet", "Coram", "NY", "11727");
		Faculty f1 = new Faculty("Louis ", "XIV", a, "Palace of Versailles", 500000);
		Faculty f2 = new Faculty("Rodgrio", "Borgia", a, "Itl302", 100000);
		pBag.addPerson(f1);
		pBag.addPerson(f2);

		Student s1 = new Student("Max", "Harrison", a, studentBag1);
		Student s2 = new Student("Mindy", "Crawford", a, studentBag2);
		pBag.addPerson(s1);
		pBag.addPerson(s2);

		studentBag1.addCoursesTaking(mcb.findCourse("CST111"));
		studentBag1.addCoursesTook(mcb.findCourse("AST101"));
		studentBag1.addCoursesToTake(mcb.findCourse("PHY131"));

		studentBag2.addCoursesTaking(mcb.findCourse("PHY131"));
		studentBag2.addCoursesTook(mcb.findCourse("AST101"));
		studentBag2.addCoursesToTake(mcb.findCourse("CST111"));


		//studentBag1.deleteCourseTaking(mcb.findCourse("CST111"));
		//studentBag1.deleteCourseTakingv2("CST111");
		//studentBag2.deleteCourseTookv2("AST101");
		pBag.displayBodyBag();


		//Note to check the length of isbn to set a limit.
		System.out.println();
		System.out.println("Now testing Textbooks");

		//tBag.deleteTextBook("2");
		//System.out.println(tBag.findTextBook("3"));
		//tBag.displayTextBook();
		//tBag.displayTextBook();

		//We need to implement TextBook

		//Note when doing the GUI output for appendage on a textarea, play around with the display method and figure something out.

	}


}
