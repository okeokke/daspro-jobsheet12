import java.util.Scanner;
public class RekapPenjualanCafe08{
    static int item=5, hari=7;
    static int[][] menu = new int[item][hari];
    static String[] nama = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
    public static void main(String[] args) {
    inpData();
    outData();
    topMenu(totalMenu());
    avgData(totalMenu());
    }
    public static void avgData(int[] totalMenu) {
        double[] avgMenu=new double[item];
        System.out.println("Rata-rata penjualan tiap menu : ");
        for (int i = 0; i < menu.length; i++) {
           avgMenu[i]=((double)totalMenu[i]/(double)hari);
           System.out.printf("Menu %-15s : ", nama[i]); System.out.printf("%.2f%n", avgMenu[i]);
        }
    }
    public static int[] totalMenu() {
        int[] totalMenu = new int[item];
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < menu[i].length; j++) {
                totalMenu[i]+=menu[i][j];
            }
        }
        return totalMenu;
    }
    public static void topMenu(int... totalMenu) {
        int max=totalMenu[0];
        int index=0;
        for (int i = 0; i < totalMenu.length; i++) {
            if (totalMenu[i]>max) {
                max=totalMenu[i];
                index=i;
            }
        }
        System.out.println("Menu dengan penjualan tertinggi adalah menu "+nama[index]+" dengan total penjualan sebanyak "+max);
        System.out.println();
    }

    public static void outData() {
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("Menu %-15s : ", nama[i]);
            for (int j = 0; j < menu[i].length; j++) {
                System.out.printf("%2d | ", menu[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void inpData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu '"+(nama[i])+"' : ");
            for (int j = 0; j < menu[i].length; j++) {
                System.out.print("    Hari ke-"+(j+1)+" : ");
                menu[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        sc.close();
        System.out.println();
    }
}