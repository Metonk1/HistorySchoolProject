//Platform exit for exit Program btn
//Answer	 in  FRONT OF ME, PRINTLN IN COURSEBAGMASTER CHANGE THAT.
//Controls, Action Listens

///Need to look into boarderPane (Top for menubar)
package practiceGUI;

import data.BodyBag;
import data.Course;
import data.MasterCourseBag;
import data.TextBag;
import data.TextBook;
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

		//TextBook
		TextBag tBag = new TextBag();
		TextBookBtnPage tbbp = new TextBookBtnPage();
		TextBookPage tbp = new TextBookPage();
		FindTextBookPage findText = new FindTextBookPage();
		DeleteTextBook deleteText = new DeleteTextBook();


		//Body Bag
		BodyBag pBag = new BodyBag();
		BodyBagPage bbp = new BodyBagPage();

		Button exitBtn = new Button("Exit Program");


		//Course section
		Button courseAdd = btnPage.getAddBtn();
		courseAdd.setOnAction(e -> {
			if(e.getSource() == courseAdd){
			stage2.setScene(cPage.getCourseScene());
			stage2.show();
			}else {
				stage2.showAndWait();
			}
		});

		cPage.getAddBtn().setOnAction(addCourse -> {

			String courseName = cPage.getCourseName();
			String courseNumber = cPage.getCourseNumber();
			int credits = Integer.parseInt(cPage.getCredits());
			
			//isbn - Note there needs to be a check if the id is null or doesn't exist (New erro - custom exception, not found)
			String isbn = cPage.getIsbn();
			
			Course c = new Course(courseNumber, courseName, credits, tBag.findTextBook(isbn));
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
			stage2.setTitle("Find Course Page");
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
				stage2.setTitle("Delete Course Page");
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


		/*
		 * TextBook Section
		 */
		Button textBookAddBtn = tbbp.getAddTextBookBtn();
		textBookAddBtn.setOnAction(addTextBook ->{
			if(addTextBook.getSource() == textBookAddBtn){
				stage2.setScene(tbp.getTextScene());
				stage2.show();
			}else{
				stage2.showAndWait();
			}
		});

		tbp.getAddButton().setOnAction(addTexts ->{
			String title = tbp.getTitle();
			String author = tbp.getAuthor(); 
			String publisher = tbp.getPublisher();
			String isbn = tbp.getIsbn();
			String year = tbp.getYear();
			String strPrice = tbp.getPrice();
			Double price = Double.parseDouble(strPrice);
			TextBook text = new TextBook(title, author, publisher, isbn, year, price);
			tBag.addTextBook(text);
			stage2.close();
			tbp.getTitleField().clear();
			tbp.getIsbnField().clear();
			tbp.getAuthorField().clear();
			tbp.getYearField().clear();
			tbp.getPriceField().clear();
			tbp.getPublisherField().clear();
		});
		
		tbbp.getdeleteTextBookBtn().setOnAction(deleteTextBook -> {
			Scene deleteTextScene = new Scene(deleteText.getDeleteTextBox());
			stage2.setScene(deleteTextScene);
			stage2.show();
			stage2.setTitle("Delete TextBook");
		});
		
		Button deleteTextBookBtn = deleteText.getDeleteTextButton();
		deleteTextBookBtn.setOnAction(d -> {
			String isbn = deleteText.getDeleteIsbn();
			tBag.deleteTextBook(isbn);
			deleteText.getDeleteByIsbnField().clear();
			stage2.close();
		});

		tbbp.getdisplayTextBookBtn().setOnAction(displayTextBook ->{
			tBag.displayTextBook();
		});

		tbbp.getfindTextBookBtn().setOnAction(findTextBook ->{
			if(findTextBook.getSource() == tbbp.getfindTextBookBtn()){	
			Scene findTextScene = new Scene(findText.getFindTextBox());
				stage2.setScene(findTextScene);
				stage2.show();
				stage2.setTitle("FindTextBook");
			}else{
				stage2.showAndWait();
			}
		});
		
		Button findTextBtn = findText.getFindTextBtn();
		findTextBtn.setOnAction(f -> {
			String isbn = findText.getFindIsbn();
			System.out.println(tBag.findTextBook(isbn));
			findText.getFindByIsbnField().clear();
			stage2.close();
		});

		tbbp.getsaveTextBtn().setOnAction(saveTextBook ->{
			tBag.saveTexts();
		});

		tbbp.getloadTextBookBtn().setOnAction(loadTextbook ->{
			tBag.loadTexts();
		});


		/*
		 * Student/Faculty/BodyBag Section
		 */
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

		/*
		 * BodyBag Section - Add
		 */


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
		homeBox.getChildren().addAll(btnPage.getBtnBox(), bbp.getbodyBtnBox(), tbbp.gettextBookBtnBox());
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
