package oopconcept;

public class BankOfAmericaApplication {
    public static void main(String[] args) {
        BankAccount dayaAccount = new BankAccount();
        BankAccount abcAccount = new BankAccount();
        abcAccount.setAccountBalance(1000.0);
        double balance=abcAccount.getAccountBalance();

        System.out.println(balance);
        //dayaAccount.accountType=AccountType.CHECKING;
        //System.out.println(dayaAccount.accountType);
    }
}
