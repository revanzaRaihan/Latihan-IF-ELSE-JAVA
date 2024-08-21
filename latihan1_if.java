package p3;
import java.util.Scanner;

public class latihan1_if {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
         System.out.print("Masukan Angka :");
        int angka = input.nextInt();
        if (angka != 0) {
            if (angka % 2 == 0) {
                System.out.println("Genap");
            }
            else{
                System.out.println("Ganjil");
            }
        }
        else if (angka == 0){
            System.out.println("NOL");
        }
    }
}
