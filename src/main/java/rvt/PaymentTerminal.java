package rvt;

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;
    private double balance;
    
    public PaymentTerminal(){
            this.money=1000;
    }
        public double eatAffordably(double payment) {
            if (payment >= 2.50) {
                this.affordableMeals ++;
                this.money += 2.50;
             return payment - 2.50;
          }

         return payment;
      }
     public double eatHeartily(double payment) {
          if(payment >= 4.30){
              this.heartyMeals ++;
             this.money += 4.30;
             return payment - 4.30;

          }
           return payment;
       }
      public String toString() {
         return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
     }
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
    
}
