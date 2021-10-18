package main.java.section_8.autoboxing_unboxing;

public class BankApp {
    public static void main(String[] args) {
        Bank newBank = new Bank("Ecobank");
        newBank.addBranch("Tema Comm 6");
        newBank.addCustToBranchWithTxn("Felix","Tema Comm 6",900.00);
        newBank.addCustToBranchWithTxn("Adjoa","Tema Comm 6",144.14);
        newBank.addCustToBranchWithTxn("Felix","Tema Comm 6",600000.49);
        newBank.addCustToBranchWithTxn("Felix","Tema Comm 6",0.45);
        newBank.addCustToBranchWithTxn("Sally","Tema Comm 6",123.23);
        newBank.addCustToBranchWithTxn("Adjoa","Tema Comm 6",99.88);

//        newBank.getAllBranchCustomers("Tema Comm 6");
        newBank.getAllBranchCustomersAndTransactions("Tema Comm 6");
    }
}
