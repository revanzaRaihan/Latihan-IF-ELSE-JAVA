package p3;
import java.util.Scanner;

public class latihan1_if {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Angka :");
        int angka = input.nextInt();
        if (angka != 0) {
            if (angka % 2 == 0) {
                System.out.println("Genap");
            }
        }
        else if (angka % 2 == 1) {
            System.out.println("Ganjil");
        }
        if (angka == 0){
            System.out.println("NOL");
        }
    }
}
