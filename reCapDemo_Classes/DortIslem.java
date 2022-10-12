package reCapDemo_Classes;

public class DortIslem {
      
	   public int topla(int sayi1, int sayi2) {
		   return sayi1+sayi2;
	   }
	   public int cıkar(int sayi1, int sayi2) {
		   return sayi1-sayi2;
	   }
	   public int carp(int sayi1, int sayi2) {
		   return sayi1*sayi2;
	   }
	   public int bol(int sayi1, int sayi2) {
		   if (sayi2==0) {
			  System.out.println("İşlem geçersizdir.");
			  
		}
		return sayi1/sayi2;
	   }
}
      
