package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitli:");
        double sk = scanner.nextDouble();

        if (sk > 0){
            System.out.println("Pozitivs");
        } else {System.out.println("Negativs");}

    }
}
