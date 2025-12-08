package rvt;


public class MainPaymentCard {

    public static void main(String[] args) {

        
        PaymentCard paulsCard = new PaymentCard(100);
        PaymentCard mattsCard = new PaymentCard(100);

        //paulsCard.EatHeartily();
        //mattsCard.EatAffordably();
        //System.out.println("Paul: " + paulsCard);
        //System.out.println("Matt: " + mattsCard);
        //paulsCard.EddMoney(20.00);
        //mattsCard.EatHeartily();
        //System.out.println("Paul: " + paulsCard);
        //System.out.println("Matt: " + mattsCard);
        //paulsCard.EatAffordably();
        //paulsCard.EatAffordably();
        //mattsCard.addMoney(50);
        //System.out.println("Paul: " + paulsCard);
        //System.out.println("Matt: " + mattsCard);
        //System.out.println("money " + mattsCard);
        //boolean wasSuccessful = mattsCard.takeMoney(75);
        //System.out.println("successfully withdrew: " + wasSuccessful);
        //System.out.println("money " + mattsCard);

        //wasSuccessful = paulsCard.takeMoney(125);
        //System.out.println("successfully withdrew: " + wasSuccessful);
        //System.out.println("money " + paulsCard);
        //PaymentTerminal unicafeExactum = new PaymentTerminal();

        //double change = unicafeExactum.eatAffordably(10);
        //System.out.println("remaining change " + change);

        //change = unicafeExactum.eatAffordably(5);
        //System.out.println("remaining change " + change);

        //change = unicafeExactum.eatHeartily(4.3);
        //System.out.println("remaining change " + change);

        //System.out.println(unicafeExactum);

        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change: " + change);

        PaymentCard annesCard = new PaymentCard(7);

        boolean wasSuccessful = unicafeExactum.eatHeartily(mattsCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatHeartily(mattsCard);
        System.out.println("there was enough money: " + wasSuccessful);
        wasSuccessful = unicafeExactum.eatAffordably(mattsCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println(unicafeExactum);

    }
}
