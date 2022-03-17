package application;

import entities.Account;
import entities.Account02;

public class App {
    public static void main(String[] args) {
        
        Account a = new Account();
        Account02 a1 = new Account02();
        
        a1.setConta("Conta corrente!");
        a1.setTitular("Eduardo");
        a1.setNumConta(555);
        a1.setSaldo(1999.80);
        a1.setSaque(1000.00);
        a1.setDeposito(0.00);
        
        a.setConta("Conta poupança!");
        a.setTitular("Daniel");
        a.setNumConta(888);
        a.setSaldo(5690.80);
        a.setSaque(2300.00);
        a.setDeposito(0.00);
        
        System.out.println(a);
        System.out.println(a1);
    }
}
