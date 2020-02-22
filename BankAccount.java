package com.Leonid;

public class BankAccount{
    protected double AccountNumber;
    protected double currentBalance;

    BankAccount(double AccountNumber,double currentBalance){
        super();
        this.AccountNumber=AccountNumber;
        this.currentBalance=currentBalance;
    }
    public double getAccountNumber(){
        return AccountNumber;}
    public double getBalance(){
        return currentBalance;
    }
    public void setNumber(double AccountNumber){
        this.AccountNumber=AccountNumber;}

        public void setBalance(double Balance){
            this.currentBalance=Balance;}

            public void Makedeposit(double amount){
            this.currentBalance+=amount;}

            public void Withdrawals(double amount){
        if(currentBalance>=amount)
            currentBalance-=amount;}

            public String toString(){
            return "Card Number"+AccountNumber+"balance"+currentBalance;}}




 class SavingAccount extends BankAccount{
     double rate;

    SavingAccount(double AccountNumber,double currentBalance,double rate) {
        super(AccountNumber, currentBalance);
        this.rate = rate;
    }
    public void setInterest(double Rate){
        rate=Rate;}

    public double getInterest() {
        return (currentBalance * rate) / 100;

    }

    public void BalanceAfterInterest(){
        setBalance(getBalance()+getInterest());}

     public double getAcBalance(){
        return getBalance()+getInterest();
        }


     public String toString() {
          return super.toString() +"Interest Rate=" + rate ;
                }
     public boolean equals(SavingAccount am){
             if(am.equals(AccountNumber))
                return true;

            if(rate!=am.rate) return false;
                return true;}
            }





   class CheckingAccount extends BankAccount {

       double fees;
       double MinBalance;

       CheckingAccount(double AccountNumber, double currentBalance, double
               MinBalance, double fees) {
           super(AccountNumber, currentBalance);
           this.fees = fees;
           this.MinBalance = MinBalance;
       }

       public void Withdrawals(double amount) {
           if (getBalance() >= amount + MinBalance + fees) {
               setBalance(getBalance() - amount - fees);
           }
       }

       public double getFees() {
           return fees;
       }

       public double getMinBalance() {
           return MinBalance;
       }

       public void setFees(double fees) {
           this.fees = fees;
       }

       public void MinBalance(double MinBalance) {
           this.MinBalance = MinBalance;
       }

       public String toString() {
           return super.toString() + "overlimit fees" + fees + "Minimum balance" + MinBalance;
       }

       public boolean equals(CheckingAccount am) {
           if (am.equals(AccountNumber))
               return true;
           if (MinBalance != am.MinBalance)
               return false;
           if (fees != am.fees) return false;


           return true;
       }

   }
