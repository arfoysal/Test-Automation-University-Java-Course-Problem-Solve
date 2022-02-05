package chapter9_Inheritance_Overriding_Overloading_AccessLimitation;

public class Employee extends Person {
	private String employeeId;
	private String title;
	

	public Employee() {
		super("Datch");
		System.out.println("In Employee default constructor");
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
