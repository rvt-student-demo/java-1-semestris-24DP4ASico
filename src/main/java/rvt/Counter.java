package rvt;

public class Counter {
    public int counter;
    public Counter( int startvalue){
        this.counter = startvalue;
    }

    public Counter(){
        this(0);
    }

    public int value(){
        return this.counter;
    }
    
    public void increase(){
        this.counter++;
    }

    public void decrease(){
        this.counter--;
    }

    public void increase(int increaseby){
        if (increaseby >= 0){
            this.counter = this.counter + increaseby;
        }
    }

    public void decrease(int decreaseby){
        if (decreaseby >= 0){
            this.counter = this.counter - decreaseby;
        }
    }

    @Override
    public String toString(){
        return "Counter: " + this.counter;
    }

    
}
