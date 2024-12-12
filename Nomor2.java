import java.util.ArrayList;
import java.util.Scanner;

public class Nomor2 {
    static ArrayList<Integer> keranjangBelanja = new ArrayList<>();
    
    static int hitungTotalBelanja() {
        int total = 0;
        for (int harga : keranjangBelanja) {
            total += harga;
        }
        return total;
    }
    
    static double hitungDiskon(int totalBelanja) {
        if (totalBelanja > 100000) {
            return totalBelanja * 0.10;
        } else if (totalBelanja >= 50000) {
            return totalBelanja * 0.05;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int[] hargaMenu = {35000, 45000, 20000, 15000};
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.print("Masukan nama menu [Burger/Steak/Spaghetti/Kentang]:");
            String menu = scan.nextLine();
            
            switch (menu.toLowerCase()) {
                case "burger":
                    keranjangBelanja.add(hargaMenu[0]);
                    break;
                case "steak":
                    keranjangBelanja.add(hargaMenu[1]);
                    break;
                case "spaghetti":
                    keranjangBelanja.add(hargaMenu[2]);
                    break;
                case "kentang":
                    keranjangBelanja.add(hargaMenu[3]);
                    break;
                default:
                    System.out.println("Menu tidak valid!");
                    continue;
            }
            
            System.out.print("Input lagi (Y/N)?: ");
            String lanjut = scan.nextLine();
            if (lanjut.equalsIgnoreCase("N")) {
                break;
            }
        }
        
        int totalBelanja = hitungTotalBelanja();
        double diskon = hitungDiskon(totalBelanja);
        double totalSetelahDiskon = totalBelanja - diskon;
        
        System.out.println("Total item pesanan = " + keranjangBelanja.size());
        System.out.println("Total yang harus dibayar = " + (int)totalSetelahDiskon);
        
        scan.close();

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
