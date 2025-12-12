package rvt;

import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int SKRUVE_CENA = 5; 
        int UZGRIEZNIS_CENA = 3;
        int PAPLACS_CENA = 1;
        System.out.print("Skrūvju skaits: ");
        int skruves = scanner.nextInt();
        System.out.print("Uzgriežņu skaits: ");
        int uzgriezni = scanner.nextInt();
        System.out.print("Paplāksņu skaits: ");
        int paplaksnes = scanner.nextInt();
        int kopejaCena = (skruves * SKRUVE_CENA) +
        (uzgriezni * UZGRIEZNIS_CENA) +
        (paplaksnes * PAPLACS_CENA);
        boolean kluda = false;
        if (uzgriezni < skruves) {
        System.out.println("Pārbaudi pasūtījumu: par maz uzgriežņu");
        kluda = true;
        }
        if (paplaksnes < 2 * skruves) {
        System.out.println("Pārbaudi pasūtījumu: par maz paplāksņu");
        kluda = true;
        }
        if (!kluda) {
        System.out.println("Pasūtījums ir kārtībā.");
        }
        System.out.println("Kopējā cena: " + kopejaCena);
        scanner.close();
    }
}
    

