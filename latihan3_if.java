package p3;

import java.util.Scanner;

public class latihan3_if {
     public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.println("KODE BARANG : ");
        System.out.println("1 = Pulpen");
        System.out.print("Masukan Kode Barang : ");
        int angka = input.nextInt();
        if (angka == 1) {
            System.out.println("Ingin beli pulpen?");
            System.out.println("Tekan 1 untuk lanjut.");
            int lanjut = input.nextInt();
            System.out.println("=======================================");
            if (lanjut == 1) {
                System.out.print("Masukan Jumlah : ");
                int jumlah = input.nextInt();
                System.out.println("=======================================");
                int hasil = (jumlah * 2000 );
                System.out.println("Total harga Rp." + hasil);
            }
            else{
                System.out.println("Input tidak ada.");
            }
        }
        else{
            System.out.println("Barang tidak ada.");
        }
    }
}
