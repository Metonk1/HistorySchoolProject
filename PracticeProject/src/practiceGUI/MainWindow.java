//Platform exit for exit Program btn
//Answer	 in  FRONT OF ME, PRINTLN IN COURSEBAGMASTER CHANGE THAT.
//Controls, Action Listens

package practiceGUI;

import data.BodyBag;
import data.Course;
import data.MasterCourseBag;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindow extends Application{

	public static void main(String[] args){
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage stage2 = new Stage();
		//Course Section
		CoursePage cPage = new CoursePage();
		CourseBtnPage btnPage = new CourseBtnPage();
		MasterCourseBag mcb = new MasterCourseBag();
		FindCourse fc = new FindCourse();
		DeleteCourse dc = new DeleteCourse();
		
		//Body Bag
		BodyBag pBag = new BodyBag();
		BodyBagPage bbp = new BodyBagPage();
		
		Button exitBtn = new Button("Exit Program");
		
		Button courseAdd = btnPage.getAddBtn();
		courseAdd.setOnAction(e -> { 
			if(e.getSource() == courseAdd){
			stage2.setScene(cPage.getCourseScene());
			stage2.show();
			}else {
				stage2.showAndWait();
			}
		});
		
		cPage.getAddBtn().setOnAction(e -> { 
			
			String courseName = cPage.getCourseName();
			String courseNumber = cPage.getCourseNumber();
			int credits = Integer.parseInt(cPage.getCredits());
			Course c = new Course(courseNumber, courseName, credits);
			mcb.addCourse(c);
			cPage.getCourseNameField().clear();
			cPage.getCourseNumberField().clear();
			cPage.getCreditField().clear();;
			
			stage2.close();
		});
		
		btnPage.getDisplayBtn().setOnAction(displayCourse -> {
				mcb.displayCourse();
		});
		
		btnPage.getFindBtn().setOnAction(findCourse -> {
			if(findCourse.getSource() == btnPage.getFindBtn()){
			stage2.setScene(fc.getFindScene());
			stage2.show();
			
			}else{
				stage2.showAndWait();
			}
			
		});
		
		fc.getFindButton().setOnAction(findCourse -> { 
			System.out.println(mcb.findCourse(fc.getCourseNumber()));
			stage2.close();
			fc.getFindCourseField().clear();
		});
		
		btnPage.getDeleteBtn().setOnAction(mainDeleteCourseBtn ->{
			if(mainDeleteCourseBtn.getSource() == btnPage.getDeleteBtn()){
				stage2.setScene(dc.getDeleteCourseScene());
				stage2.show();
			}else{
				stage2.showAndWait();
			}
		});
		
		dc.getDeleteBtn().setOnAction(deleteCourse ->{
			mcb.deleteCourse(dc.getCourseNumber());
			dc.getDeleteField().clear();
			stage2.close();
		});
		
		btnPage.getSaveBtn().setOnAction(saveCourses ->{
			mcb.saveCourse();
		});
		
		btnPage.getLoadBtn().setOnAction(loadCourses ->{
			mcb.loadCourse();
		});
		
		
		//Button add = cPage.getAddBtn();
		//Button add2 = new Button("Hello");

		//You can add as long as you create a new VBox to add to it, still need more work.
		//VBox p = cPage.getCourseVBox();
		//p.getChildren().add(add2);
	/*	add.setOnAction(e -> {
			//System.out.println("Course Name: " + cPage.getCourseName());
			//System.out.println("Course Number: " + cPage.getCourseNumber());
			//System.out.println("Course Credits: " + cPage.getCredits());

			int credits = Integer.parseInt(cPage.getCredits());
			Course c = new Course(cPage.getCourseNumber(), cPage.getCourseName(), credits);
			System.out.println("Course Created: " + c);
		});*/

	

		/*add2.setOnAction(e -> {
		Scene scene2 = new Scene(btnPage.getBtnBox());
		stage2.setScene(scene2);
		stage2.show();
		});*/
		
		//For Exit have a warning for are you sure and save data.
		exitBtn.setOnAction(exit -> {
			Platform.exit();
		});

		//We don't need Scene for that, for CourseBtn, just not yet. I guess....
		//primaryStage.setScene(btnPage.getCourseBtnScene());
		
		VBox homeBox = new VBox(10);
		homeBox.getChildren().addAll(btnPage.getBtnBox(), bbp.getbodyBtnBox());
		Scene homeScene = new Scene(homeBox);
		primaryStage.setScene(homeScene);
		
		
		primaryStage.show();


	}

}

/*
//3-21 Attempt 1 - fixed mistakes, and gui does display
//-----
//Now going to work on getting data
 *	Attempt 2- Okay i have added the button and got the data. Everything looks okay. Now we need to decide about course creation and button
 *
 *Update 3 - It looks like the method to print it works, but i still need more work on it
 *
 *update 4- it looks like the method to create courses does work, but still needs more work
 *
 *Update 5 - we will now work on implementing stuff to courseBag and adding it. We got switch a few things. Want btn page to be first
 */
