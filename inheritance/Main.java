package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Employee employee= new Employee();
		employee.email="wcuwc@lec.com";
		customer.id=125556;
		customer.adress="back street";
        
		System.out.println(customer.id);
	}

}
