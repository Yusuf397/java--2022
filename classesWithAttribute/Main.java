package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("telefon");
		product.setDescription("ev telefonu");
		product.setId(1236);
		product.setPrice(250);
		product.setStockAmount(4);
		
		System.out.println(product.getName());

	}

}
