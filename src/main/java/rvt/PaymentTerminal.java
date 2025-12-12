package rvt;

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;
    
    public PaymentTerminal(){
            this.money=1000;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0){
            this.money += sum;
            card.addMoney(sum);
        }
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
     public boolean eataffordably(PaymentCard card) {
        if (card.takeMoney(2.50)){
            this.affordableMeals ++;
            return true;
            
        }
        return false;
    }

    public boolean eatheartily(PaymentCard card) {
        if (card.takeMoney(4.30)){
            this.heartyMeals ++;
            return true;
        }
        return false;
    }

    
    
}
