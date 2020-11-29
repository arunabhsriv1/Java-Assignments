package fundamentals1.assignment1;

public class Runner {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Ather");
		emp.setEmail("at@gmail.com");
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getEmail());
	}

}
