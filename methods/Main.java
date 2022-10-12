package methods;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();
	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 5, 6, 7 };
		int aranacak = 7;

		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
			}
		}
		if (varMi) {
			mesajVer("Sayı mevcuttur.");
		} else {
			mesajVer("Sayı mevcut değildir.");
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}
}
