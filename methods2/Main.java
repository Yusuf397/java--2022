package methods2;

public class Main {

	public static void main(String[] args) {

		String newMessage = "Bugün hava çok güzel.";
		newMessage.substring(0, 5);
		int toplam = topla(8, 7);
		// System.out.println(toplam);
		int toplam3 = topla2(2, 20, 3, 65,56);
		System.out.println(toplam3);
	}

	public static void ekle() {
		System.out.println("eklendi");
	}

	public static void sil() {
		System.out.println("silindi");
	}

	public static void güncelle() {
		System.out.println("güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam2 = 0;
		for (int sayi : sayilar) {
			toplam2 += sayi;
		}
		return toplam2;
	}
}
