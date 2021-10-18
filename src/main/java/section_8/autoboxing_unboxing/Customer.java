package main.java.section_8.autoboxing_unboxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name){
        this.name = name;
        transactions = new ArrayList<Double>();
    }

    public Customer(String name, double firstTransaction){
        this(name);
        transactions.add(firstTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transactionValue){
        transactions.add(transactionValue);
    }
}
