package rvt;


public class a1 {
    public static void main(String[]args){
        printUntilNumber(5);
    }
    
    public static void printUntilNumber(int num){
        Integer count = 1;
        while(count <= num){
            System.out.println(count);
            count = count +1;
        }


    }
}
