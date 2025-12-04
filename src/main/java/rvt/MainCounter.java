package rvt;

public class MainCounter {
    public static void main(String[] args){
        Counter  count = new Counter(15);

        count.increase(15);
        count.decrease(45);
        count.decrease(20);
        count.increase(17);
    }
    
}
