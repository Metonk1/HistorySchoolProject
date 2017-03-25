package practiceGUI;
import javafx.scene.Scene;
//okBtn.setprefWidth(100); - default Length by string length
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class TextBookBtnPage {
	private HBox textBookBtnBox;
	private Button addTextBook;
	private Button findTextBook;
	private Button displayTextBook;
	private Button deleteTextBook;
	private Button saveTextBtn;
	private Button loadTextBtn;

	private Scene textBookScene;

	public TextBookBtnPage(){

		addTextBook = new Button("Add TextBook");
		findTextBook = new Button("Find TextBook");
		deleteTextBook = new Button("Delete TextBook");
		displayTextBook = new Button("Display TextBook");
		saveTextBtn = new Button("Save TextBooks");
		loadTextBtn = new Button("Load TextBooks");
		textBookBtnBox = new HBox(10);
		textBookBtnBox.getChildren().addAll(addTextBook, findTextBook, deleteTextBook, displayTextBook, saveTextBtn, loadTextBtn );
		textBookScene = new Scene(textBookBtnBox);
	}


	public Scene getTextBookScene(){
		return textBookScene;
	}

	public HBox gettextBookBtnBox(){
		return textBookBtnBox;
	}

	public Button getAddTextBookBtn(){
			return addTextBook;
	}
	public Button getfindTextBookBtn(){
		return findTextBook;
	}
	public Button getdeleteTextBookBtn(){
		return deleteTextBook;
	}
	public Button getdisplayTextBookBtn(){
		return displayTextBook;
	}
	public Button getsaveTextBtn(){
		return saveTextBtn;
	}
	public Button getloadTextBookBtn(){
		return loadTextBtn;
	}

}
