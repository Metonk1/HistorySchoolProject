package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class TextBag implements Serializable {
	
	private ArrayList<TextBook> tBag = new ArrayList<>();

	public TextBag() {
		super();
	}
	
	//Add
	public void addTextBook(TextBook book){
		tBag.add(book);
	}
	
	//Find
	public TextBook findTextBook(String isbn){
		for(TextBook b : tBag){
			if(b.getIsbn().equals(isbn)){
				return b;
			}
		}
		return null;
	}
	
	//Delete - custom
	public TextBook deleteTextBook(String isbn){
		int counter = 0;
		for(TextBook t : tBag){
			if(t.getIsbn().equals(isbn))
				break;
			counter++;
		}
		if(counter < tBag.size()){
			return tBag.remove(counter);
		}
		return null;
	}
	
	//Display - this may be obsolete, with other idea of just getting the bag.
	public void displayTextBook(){
		for(TextBook b : tBag){
			System.out.println(b);
		}
		if(tBag.isEmpty()){
			System.out.println("TextBookBag is empty");
		}
	}
	//Save
	public void saveTexts(){
		try {
			FileOutputStream fos = new FileOutputStream("TextBooks.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(tBag);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	//Load
	public void loadTexts(){
		try {
			FileInputStream fis = new FileInputStream("TextBooks.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			tBag = (ArrayList<TextBook>) ois.readObject();
		} catch (FileNotFoundException e) {
			//See about this here
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<TextBook> gettBag() {
		return tBag;
	}

	public void settBag(ArrayList<TextBook> tBag) {
		this.tBag = tBag;
	}
	
	
}
