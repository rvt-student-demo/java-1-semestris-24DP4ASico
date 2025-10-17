package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Lists {
    public static void main(String[]args){
        OnlyTheseNumbers();
    }
    public static void OnlyTheseNumbers(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true){
    
            System.out.println("Enter number, to stop enter -1:");
            
            int input = scanner.nextInt();
            if( input == -1){
                break;
            }
        
            numbers.add(input);
        }
            System.out.println("Start index: ");
            int start = scanner.nextInt();

            System.out.println("End index: ");
            int end = scanner.nextInt();

            for( int index = start; index < end; index++){
                int number = numbers.get(index);
                System.out.println(number);

            }

        
    }
    public static void ListSize(){}
    public static void OnTheList(){}
    public static void RemoveLast(ArrayList<String> strings){}
    
    
}
