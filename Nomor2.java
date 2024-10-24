import java.util.Scanner;

public class Nomor2{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        int hargaLabubu = 300000;
        int hargaJenglot = 250000;
        int hargaVoodoo = 200000;

        int totalTransaksi = 0;
        double totalUangDiterima = 0;
        String inputLagi = "";

        do {
            System.out.print("Masukan nama produk [Labubu/Jenglot/Voodoo]: ");
            String produk = scanner.next();
            System.out.print("Jumlah pembelian: ");
            int jumlahPembelian = scanner.nextInt();
            
            double totalHarga = 0;

            
            switch (produk.toLowerCase()) {
                case "labubu":
                    totalHarga = hargaLabubu * jumlahPembelian;
                    break;
                case "jenglot":
                    totalHarga = hargaJenglot * jumlahPembelian;
                    break;
                case "voodoo":
                    totalHarga = hargaVoodoo * jumlahPembelian;
                    break;
                default:
                    System.out.println("Produk tidak valid");
                    continue;
            }

            
            if (totalHarga >= 1000000) {
                totalHarga *= 0.85;  
            } else if (totalHarga >= 500000) {
                totalHarga *= 0.90;  
            }

            
            totalTransaksi++;
            totalUangDiterima += totalHarga;

            
            System.out.print("Input lagi (Y/N)?: ");
            inputLagi = scanner.next();

        } while (inputLagi.equalsIgnoreCase("Y"));

        
        System.out.println("Total transaksi yang terjadi = " + totalTransaksi);
        System.out.println("Jumlah uang yang diterima = " + totalUangDiterima);
    }
}
