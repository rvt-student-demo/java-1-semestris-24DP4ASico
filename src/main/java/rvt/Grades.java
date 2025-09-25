package rvt;

import java.util.Scanner;

public class Grades {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your points:");
        double points = scanner.nextDouble();

        if(points>100){
            System.out.println("Incredible!");
        } else if(points <= 100 && 90<= points){
            System.out.println("5");
        }else if(points <= 89 && 80<= points){
            System.out.println("4");
        }else if(points <= 79 && 70<= points){
            System.out.println("3");
        }else if(points <= 69 && 60<= points){
            System.out.println("2");
        }else if(points <= 59 && 50<= points){
            System.out.println("1");
        }else if(points <= 49 && 0<= points){
            System.out.println("Failed");
        }else if(points<0){
            System.out.println("Impossible!");
        }
    }
    
}
