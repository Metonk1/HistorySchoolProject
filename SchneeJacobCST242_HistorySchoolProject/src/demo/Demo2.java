//This will be testing for Exception handling
package demo;

import java.util.Scanner;

import model.Course;
import model.MasterCourseBag;

public class Demo2 {

	public static void main(String[] args) {

		MasterCourseBag mcb = new MasterCourseBag();
		//Course c1 = new Course("CST111","Programming", 5 );
		
		//System.out.println(c1);
		
		/*Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Course Credits");
		String strCredits = in.nextLine();
		int credit = Integer.parseInt(strCredits);
		Course c1 = new Course("CST111", "Programming", credit);
		System.out.print(c1);*/
		
	/*	System.out.println("Enter Course Name");
		String courseName = in.nextLine();
		//int credit = Integer.parseInt(strCredits);
		Course c1 = new Course("CST111", courseName, 4);
		System.out.print(c1);
		*/
	/*	String name = "j8h6f6f6f";
	
	
			for (int i = 0; i < name.length(); i++) {
				if (Character.isDigit(name.charAt(i)))
					try {
						throw new CourseNameException("Error digit");
					} catch (CourseNameException e) {
						name = JOptionPane.showInputDialog("New Name! " );
						System.out.println(name);
					}
			
			}
		
				*/
	}

}
