package com.Leonid;

public class Driver {
    public static void main(String[] args){

        BankAccount []bank=new BankAccount[4];
        bank[0]=new SavingAccount(353,34455,2);
        bank[1]=new SavingAccount(352,55454,3);
        bank[2]=new CheckingAccount(223,233,100,50);
        bank[3]=new CheckingAccount(225,1000,50,100);
        System.out.println("Account info:"+bank);
        bank[2].Withdrawals(65);
        for (int i=0;i<bank.length;i++){
            System.out.println(bank[i]);
        }
        int count=0;
        for (int i=0;i<bank.length;i++){
            if(bank[i]instanceof BankAccount)
                count+=bank[i].getBalance();}
        System.out.println("Total amount"+count);
    }
}
