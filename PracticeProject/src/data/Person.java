package data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;

//We'll be following the basic outline
public  abstract class Person implements Serializable{

	private String fName;
	private String lName;
	private String id;
	private Address address;
	private static int idNumber = 1;

	public Person(String fName, String lName, Address address) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;


		//READING THE FILE
		File file = new File("schoolIds.txt");
		try {
			Scanner readFile = new Scanner(file);
			idNumber = readFile.nextInt();
			readFile.close();
		} catch (FileNotFoundException e) {
		}

		this.id = String.valueOf(idNumber++);

		//To expand it - REmember when using the find it, needs the full id
		/*	for(int j = id.length(); j < 8; j++){
			if(j == 7){
				break;
			}
			id = "0" + id;
		}*/

		//SAVING/WRITING TO FILe
		try {
			PrintWriter pw = new PrintWriter(file);
			pw.println(idNumber);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}



	}
	
	public Person(Person p){
		this.fName = p.getfName();
		this.lName = p.getlName();
		this.id =	p.getId();
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = new Address(address);
	}
	public String getId() {
		return id;
	}
	
	

	
	
/*	public static int getIdNumber() {
	//will only print 1	return idNumber;
	}*/

	//Temporary
/*	public void setId(String id) {
		this.id = id;
	}*/

	@Override
	public String toString() {
		return "Person: Fist Name = " + fName + ", Last Name = " + lName + ", id= " + id + ", address= " + address + "]";
	}




}
