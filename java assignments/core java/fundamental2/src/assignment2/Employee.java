package assignment2;

public class Employee {
	static int counter;
	private int id;
	private String name;
	
	
	public Employee() {
		super();
		counter++;
		
	}

	public Employee(int id, String name) {
		super();
		counter++;
		this.id = id;
		this.name = name;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Employee.counter = counter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
