package data;
import java.io.Serializable;

public class Faculty extends Person  implements Serializable{
	
	private String office;
	private double salary;
	public Faculty(String fName, String lName, Address address, String office, double salary) {
		super(fName, lName, address);
		this.office = office;
		this.salary = salary;
	}
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Faculty: "  + "Id = " + getId()  + "\n" + "First Name = " + getfName() + ", Last Name = " + getlName() + "\n" + "Address = " + getAddress()
		+ "\n"	+ "Office Number = " + office + "\n" + "Current Salary = " + salary + "\n";
		
	}
	
	
}
