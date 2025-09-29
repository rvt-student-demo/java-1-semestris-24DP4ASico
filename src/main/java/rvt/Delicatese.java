package rvt;

import java.util.Scanner;

public class Delicatese {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi preci: ");
        String prece = scanner.nextLine();
        System.out.println("Ievadi cenu: ");
        double cena = scanner.nextDouble();
        System.out.println("Ekspress piegāde (0=nē, 1=jā): ");
        int ekspress = scanner.nextInt();
        double piegade = 0.0;
        if (cena < 10) {
        piegade = 2.0;
        } else {
        piegade = 0.0;
        }
        if (ekspress == 1) {
        piegade += 3.0;
        }
        double kopa = cena + piegade;
        System.out.println("\nRēķins:");
        System.out.println("Prece: " + prece + " Cena:" + cena);
        System.out.println("Piegade: " + piegade);
        System.out.println("Kopa: " + kopa);
        
    }


}

