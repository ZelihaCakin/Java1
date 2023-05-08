package merhabaDunya;

public class Main {

	public static void main(String[] args) {
		String ad = "zeliha";
		String mesaj = "bugün hava çok güzel";
		System.out.println(mesaj);
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		for (String kelime : ad.split("l")) {
			System.out.println(kelime);
		}
		System.out.println(ad.trim());
		System.out.println("Merhaba Dünya");
		
	}

}
