package rvt;

public class Chapter60 {
    public static void main(String[] args){
        exs1();
        exs2();
        exs3();
        exs4();
        exs5();


    }
    public static void exs1(){
        int[] val = {0, 1, 2, 3}; 
        double result = 0;
        for(int i = 0; i<val.length; i++){
            result = result + val[i];
        }
 

        System.out.println( "Sum of all numbers = " + result );
    }
    public static void exs2(){
        int[] val = {13, -4, 82, 17}; 
        int[] twice = new int[val.length]; 

        twice[ 0 ]  = val[ 0 ]*2;
        twice[ 1 ]  = val[ 1 ]*2 ;
        twice[ 2 ]  = val[ 2 ]*2 ;
        twice[ 3 ]  = val[ 3 ]*2 ;
    
        System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
        System.out.println( "New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
    }
    public static void exs3(){
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {-12,  24, -79, -13};
        int[] sum    = {  0,   0,   0,   0};
       
        sum[0] = valA[0]+valB[0];
        sum[1] = valA[1]+valB[1];
        sum[2] = valA[2]+valB[2];
        sum[2] = valA[2]+valB[2];

    

        System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }
    public static void exs4(){
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {  12, 47,  -57,  8};
    
        System.out.println( "valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
 
        System.out.println( "valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

        System.out.println( "sum:  "  + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
    }
    public static void exs5(){
        int[] val = {0, 1, 2, 3}; 
        int temp;
        
        System.out.println( "Original Array: ");
        for(int i = 0; i < val.length; i++){
            System.out.println(val[i] + "");
        }

        for(int i = 0; i < val.length/2; i++){
            temp = val[i];
            val[i] = val[val.length - 1 - i];
            val[val.length - 1 - i] = temp;
        }
         System.out.println( "Reversed Array: ");
        for(int i = 0; i < val.length; i++){
            System.out.println(val[i] + "");
        }

    }
  

}
