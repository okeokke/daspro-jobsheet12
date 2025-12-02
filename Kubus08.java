import java.util.Scanner;
public class Kubus08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan panjang sisi kubus: ");
    int sisi = sc.nextInt();

    volumeKubus(sisi);
    luasPermukaanKubus(sisi);

    System.out.println("Volume Kubus: "+volumeKubus(sisi)+" unit_kubik");
    System.out.println("Luas Permukaan Kubus: "+luasPermukaanKubus(sisi) + " unit_persegi");
    sc.close();
  }
  
  static int volumeKubus(int a) {
    int vol = a*a*a;
    return vol;
  }
  static int luasPermukaanKubus(int a) {
    int luas = 6*a*a;
    return luas;
  }
}