public class PengunjungCafe08 {
  public static void main(String[] args) {
    daftarPengunjung("Ali", "Budi", "Citra");
    daftarPengunjung("Andi");
    daftarPengunjung("Doni","Eti","Fahmi","Galih");
  }
  public static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar Nama Pengunjung:");
    for (String nama : namaPengunjung) {
       System.out.println("- "+nama); 
    }
  }
}
