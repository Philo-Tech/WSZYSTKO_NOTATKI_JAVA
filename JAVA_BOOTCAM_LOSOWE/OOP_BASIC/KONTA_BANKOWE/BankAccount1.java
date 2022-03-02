package com.company.JAVA_BOOTCAM_LOSOWE.OOP_BASIC.KONTA_BANKOWE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount1 {
    private int balance;

    public BankAccount1(int balance){
        this.balance = balance;
    }

    public class BalanceCounter implements ActionListener{

        private double interestRate;

        public BalanceCounter(double interestRate) {
            this.interestRate = interestRate;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int newBalance = (int) (BankAccount1.this.balance + balance * interestRate);
            System.out.println("Changing ACCOUNT BALANCE FROM" + balance + " to " + newBalance);
        }
    }

}
