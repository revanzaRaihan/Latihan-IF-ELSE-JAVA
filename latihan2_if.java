package p3;

import java.util.Scanner;

public class latihan2_if {
     public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Angka :");
        int angka = input.nextInt();
        if (angka < 0) {
            System.out.println("Negatif");
        }
        else if (angka >= 1) {
            System.out.println("Positif");
        }
        if (angka == 0){
            System.out.println("NOL");
        }
    }
}
