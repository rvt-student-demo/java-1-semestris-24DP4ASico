package rvt;

public class PaymentCard {

    private double balance;
    private double money;
    private int affordableMeals;
    private int heartyMeals;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        
    }

    //public String toString() {
    //    return "The card has a balance of " + this.balance + " euros";
    //}

    public boolean EatAffordably() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
            return true;
        }
        return false;
    }

    public boolean EatHeartily() {
        if (this.balance >= 4.30) {
            this.balance -= 4.30;
            return true;
        }
        return false;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }
    public boolean takeMoney(double amount){
        if(this.balance >= amount){
            this.balance = this.balance - amount;
            return true;
        }
        else{
            return false;
        }
    }
}
        






