package main.java.section_8.autoboxing_unboxing;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;
    private ArrayList<Double> transactions;

    public Branch(String name){
        this.branchName = name;
        customers = new ArrayList<Customer>();
        transactions = new ArrayList<Double>();
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }

    public void addNewCustomer(String name, double firstTransaction){
        if (exists(name)) {
            System.out.println("Customer already exists");
        }else{
            customers.add(new Customer(name,firstTransaction));
            addTransaction(firstTransaction);
        }
    }

    public void addCustomerTransaction(String name, double transaction){
        int index = getCustomerIdx(name);
        if (index >= 0){
            customers.get(index).addTransaction(transaction);
            addTransaction(transaction);
        }
    }

    public boolean exists(String name){
        for (Customer c : customers
             ) {
            if (c.getName().equals(name))
                return true;
        }
        return false;
    }

    private int getCustomerIdx(String name){
        for (int i = 0; i < customers.size(); i++){
            if (customers.get(i).getName().equals(name)) return i;
        }
        return -1;
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
}
