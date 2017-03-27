package demo;

import data.Address;
import data.Course;
import data.MasterCourseBag;
import data.Student;
import data.StudentCourseBag;
import data.TextBag;
import data.TextBook;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import practiceGUI.CoursesTakingPage;
import practiceGUI.CoursesToTakePage;
import practiceGUI.CoursesTookPage;
import practiceGUI.StudentPage;

//I want to try the Node <- Shape and Imageview subclasses, as well circle, arc and write Text
//I can't forget Parent <- Group (Did that before)

//Two relationships
//Composition/Aggregation "has a" Scene has a button (Polymorphism) Scene can have a parent, and scene cna have a node.
//Inheritance "is a" Student is a person

//Scene can only have one thing, either parent or pane or node

//Interesting, if(name.getText().isEmpty()){
//	throw new IllegalArgumentException("Namefield cannot be empty"); -thats cool



/*
 *  Update 3:30 3-27 - Everything seems to be created, now the next thing is to make the Back Btns work, and then lastly create it. 
 *  Also we need make sure everything resets, once a student is created
 *  
 *  So we can't do back btns so lets just do a summary page of everything
 *  
 *  
 */
public class GuiPracticeFromClass extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		
		TextBag tBag = new TextBag();
		TextBook t1 = new TextBook("How to be dumb", "Scott brown", "Dumb inc", "3", "2015", 150.00);
		TextBook t2 = new TextBook("Astronony for Idiots", "Peter", "Dumb inc", "2", "2016", 3000.00);
		TextBook t3 = new TextBook("Make A Million Dollars Fast", " Lewis", "Dumb inc", "1", "2002", 541.00);
		tBag.addTextBook(t3);
		tBag.addTextBook(t2);
		tBag.addTextBook(t1);

		//courses
		MasterCourseBag mcb = new MasterCourseBag();
		Course c1 = new Course("1111", "CST111", 5, t1);
		Course c2 = new Course("2222", "AST222", 7, t2);
		Course c3 = new Course("3333", "MACRO3333", 4, t3);
		Course c4 = new Course("4444", "LUGO4444", 1, t1);
		mcb.addCourse(c1);
		mcb.addCourse(c2);
		mcb.addCourse(c3);
		mcb.addCourse(c4);

		Course a1 = new Course("123", "CST242", 1, t2);
		Course a2 = new Course("456", "CST246", 2, t3);
		Course a3 = new Course("789", "CST259", 5, t1);

		mcb.addCourse(a1);
		mcb.addCourse(a2);
		mcb.addCourse(a3);
		mcb.displayCourse();
		
		
		//PersonPage pp = new PersonPage();
		StudentPage sp = new StudentPage(); //This works
		CoursesTakingPage ctp = new CoursesTakingPage();
		CoursesToTakePage cttp = new CoursesToTakePage();
		CoursesTookPage ctookp = new CoursesTookPage();
		//FacultyPage fp = new FacultyPage(); //This doesn't now
		
		//VBox box1 = fp.getFacultyBox();
		VBox box1 = sp.getStudentBox();
		Scene scene = new Scene(box1);
		stage.setScene(scene);

		//Courses Taking
		sp.getNextBtn().setOnAction(e ->{
			stage.setScene(ctp.getCoursesTakingScene());
		});
		
		ctp.getEnterBtn().setOnAction(a -> {
			int amount = Integer.parseInt(ctp.getAmountCoursesTaking());
			stage.setScene(ctp.getCoursesTakingSceneII());
			ctp.setVBoxCoursesTaking(amount);
		});
		
		
			
		

		
		
		//CoursesToTake
		ctp.getNextBtn().setOnAction(next1 -> {
			if(next1.getSource() == ctp.getNextBtn()){
			//stage.setScene(cttp.getCoursesToTake());
				
				StudentCourseBag sBag = new StudentCourseBag();
				String fName = sp.getFirstName();
				String lName = sp.getLastName();
				String stNumb = sp.getStreetNumber();
				String stName = sp.getStreetName();
				String town = sp.getCity();
				String state = sp.getState();
				String zip = sp.getZip();
				
				//sBag.addCoursesTaking(mcb.findCourse(ctp.getCourseTakingField().getText()));
				//It partially works
			
				Address a = new Address(stNumb, stName, town, state, zip);
				Student s = new Student(fName, lName, a, sBag);
			
				TextField[] t = ctp.getCoursesTakingField();
				ctp.getCoursesTakingField();
				for(int i = 0; i < 2; i++){
					System.out.println(t[i].getText());
					sBag.addCoursesTaking(mcb.findCourse(t[i].getText()));
				}
				
				
				System.out.println("Student Created: ");
				System.out.println(s);
				System.out.println();
				
				
				stage.setScene(scene);
			}else{
				stage.showAndWait();
			}
		});
		//Pause for the moment - ERASE AFTERWARDS WHEN YOU CHANGE IT JAKE
	
		cttp.getEnterBtn().setOnAction(b -> {
			int amount = Integer.parseInt(cttp.getAmountCoursesToTake());
			stage.setScene(cttp.getCoursesToTakeSceneII());
			cttp.setVBoxCoursesTaking(amount);
		});
		
		
		//CoursesTook
		cttp.getNextBtn().setOnAction(next2 -> {
			if(next2.getSource() == cttp.getNextBtn()){
				stage.setScene(ctookp.getCoursesTookScene());
			}else{
				stage.showAndWait();
			}
		});
		
		ctookp.getEnterBtn().setOnAction(c -> {
			int amount = Integer.parseInt(ctookp.getAmountCoursesTook());
			stage.setScene(ctookp.getCoursesTookSceneII());
			ctookp.setVBoxCoursesTook(amount);
		});
		
		//Finish
		ctookp.getFinishBtn().setOnAction(finishedStudent ->{ 
			
			//First start off the basic info, then go to studentbag
			//We know it can create student, next is the sbag info
			StudentCourseBag sBag = new StudentCourseBag();
			String fName = sp.getFirstName();
			String lName = sp.getLastName();
			String stNumb = sp.getStreetNumber();
			String stName = sp.getStreetName();
			String town = sp.getCity();
			String state = sp.getState();
			String zip = sp.getZip();
			
			
			Address a = new Address(stNumb, stName, town, state, zip);
			Student s = new Student(fName, lName, a, sBag);
			System.out.println("Student Created: ");
			System.out.println(s);
			//stage.setScene(scene);
			Platform.exit();
		});
		

		
		
		stage.show();
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
	

}
