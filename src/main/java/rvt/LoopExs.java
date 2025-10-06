package rvt;

import java.util.Scanner;

public class LoopExs {
    public static void main(String[] args) {
        
    }
    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start:");
        Integer num1 = scanner.nextInt();

        System.out.println("Enter end:");
        Integer num2 = scanner.nextInt();
        
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }

    }
    
}
