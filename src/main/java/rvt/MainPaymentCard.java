package rvt;


public class MainPaymentCard {

    public static void main(String[] args) {

        
        //PaymentCard paulsCard = new PaymentCard(100);
        //PaymentCard mattsCard = new PaymentCard(100);

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

        //PaymentTerminal unicafeExactum = new PaymentTerminal();

        //double change = unicafeExactum.eatAffordably(10);
        //System.out.println("remaining change: " + change);

        //boolean wasSuccessful = unicafeExactum.eatheartily(mattsCard);
        //System.out.println("there was enough money: " + wasSuccessful);
        //wasSuccessful = unicafeExactum.eatheartily(mattsCard);
        //System.out.println("there was enough money: " + wasSuccessful);
        //wasSuccessful = unicafeExactum.eataffordably(mattsCard);
        //System.out.println("there was enough money: " + wasSuccessful);

        //System.out.println(unicafeExactum);

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatheartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        wasSuccessful = unicafeExactum.eatheartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }

    }
