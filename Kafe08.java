import java.util.Scanner;
public class Kafe08 {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Masukkan kode promo : ");
    String kodePromo = sc.nextLine(); 
    Menu("Budi", true, kodePromo);
    System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
    int pilihanMenu = sc.nextInt();
    System.out.print("Jumlah porsi yang dipesan : ");
    int banyakItem = sc.nextInt(); sc.nextLine();

    int totalHarga = hitungTotalHarga08(pilihanMenu, banyakItem, kodePromo);
    
    System.out.println("Total harga untuk pesanan Anda: Rp"+totalHarga);
  } 
  public static int hitungTotalHarga08 (int pilihanMenu, int banyakItem, String kodePromo) {
      int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
      int hargaTotal = hargaItems [pilihanMenu - 1] * banyakItem;
      
      if (kodePromo.equalsIgnoreCase("DISKON50")) {
      System.out.println("Diskon 50% diterapkan");
      hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
    } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
      System.out.println("Diskon 30% diterapkan");
      hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
    } else {
      System.out.println("Kode promo tidak valid");
    }
      
      return hargaTotal;
    }
  public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
    System.out.println("Selamat datang, "+ namaPelanggan + "!");
    if (isMember) {
      System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }
    if (kodePromo.equalsIgnoreCase("DISKON50")) {
      System.out.println("Promo berlaku: Diskon 50%");
    } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
      System.out.println("Promo berlaku: Diskon 30%");
    } else {
      System.out.println("Kode promo tidak valid");
    }
    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("===========================");
    System.out.println("Silakan pilih menu yang Anda inginkan");
  }
}