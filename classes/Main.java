package classes;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager  customerManager= new CustomerManager();
		customerManager.add();
		customerManager.remove();
		customerManager.update();
        
		//reference type
		int[] sayilar= new int[] {1,2,3};
		int[] sayilar2= new int[] {4,5,6};
		sayilar2=sayilar;
		sayilar[0]=10;
		System.out.println(sayilar2[0]);
		
	}

}
