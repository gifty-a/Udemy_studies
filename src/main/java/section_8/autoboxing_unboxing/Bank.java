package main.java.section_8.autoboxing_unboxing;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name){
        this.name = name;
        branches = new ArrayList<Branch>();
    }
    public void addBranch(String name){
        branches.add(new Branch(name));
    }
    public void addCustToBranchWithTxn(String customerName, String branchName, double transactionValue){
        int idx = findBranchIdx(branchName);
        Branch branch;
        if (idx >= 0){
            branch = branches.get(idx);
            if (branch.exists(customerName)) branch.addCustomerTransaction(customerName,transactionValue);
            else branch.addNewCustomer(customerName,transactionValue);
        }
    }

    public void addTxnForExistingCustomer(String customerName, double transactionValue, String branchName){
        int idx = findBranchIdx(branchName);
        Branch branch;
        if (idx >= 0){
            branch = branches.get(idx);
            branch.addCustomerTransaction(customerName,transactionValue);
        }
    }

    public void getAllBranchCustomers(String branchName){
        int idx = findBranchIdx(branchName);
        ArrayList<Customer> branchCustomers;
        int num = 0;
        Branch branch;
        if (idx >= 0){
            branch = branches.get(idx);
            branchCustomers = branch.getCustomers();
             branchCustomers.forEach((customer) -> {
                System.out.println(branchCustomers.indexOf(customer)  + " " + customer.getName());
            });
        }
    }

    public void getAllBranchCustomersAndTransactions(String branchName){
        int idx = findBranchIdx(branchName);
        ArrayList<Customer> branchCustomers;
        int num = 0;
        Branch branch;
        if (idx >= 0){
            branch = branches.get(idx);
            branchCustomers = branch.getCustomers();
            branchCustomers.forEach((customer) -> {
                System.out.println(branchCustomers.indexOf(customer)  + " " + customer.getName());
                 customer.getTransactions().forEach(t -> {
                     System.out.println(t);
                 });
            });
        }
    }

    private int findBranchIdx(String name){
        for (int i = 0; i < branches.size(); i++){
            if (branches.get(i).getBranchName().equals(name)) return i;
        }
        return -1;
    }
}
