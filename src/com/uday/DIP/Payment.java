package com.uday.DIP;
public class Payment {

    private BankCard bankCard;

    public Payment(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(int amount){
        bankCard.doPayment(amount);
    }

    public static void main(String[] args) {
       // DebitCard debitCard=new DebitCard();
       // CreditCard creditCard=new CreditCard();

        BankCard bankCard=new CreditCard();
        Payment shoppingMall=new Payment(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}