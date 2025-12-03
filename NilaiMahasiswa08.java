import java.util.Scanner;
public class NilaiMahasiswa08 {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Masukkan jumlah mahasiswa : "); int N=sc.nextInt();
    int[] nilai = new int[N];
    isianArray(nilai);
    tampilArray(nilai);
    hitTot(nilai);
    System.out.println("Total nilai semua mahasiswa : "+hitTot(nilai));
  }
  public static int hitTot(int[] arr) {
    int total=0;
    for (int i = 0; i < arr.length; i++) {
      total+=arr[i];
    }
    return total;
  }
  public static void tampilArray(int[] arr) {
    System.out.println("-- Hasil nilai mahasiswa --");
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Mahasiswa ke-"+(i+1)+" : "+arr[i]);
    }
  }
  public static void isianArray(int[] arr) {
    System.out.println("-- Isi nilai mahasiswa --");
    for (int i = 0; i < arr.length; i++) {
      System.out.print("Mahasiswa ke-"+(i+1)+" : ");
      arr[i]=sc.nextInt();
    }
  }
}
