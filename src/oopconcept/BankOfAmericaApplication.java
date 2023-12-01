package oopconcept;

public class BankOfAmericaApplication {
    public static void main(String[] args) {
        BankAccount dayaAccount = new BankAccount();
        BankAccount abcAccount = new BankAccount();
        abcAccount.setAccountBalance(1000.0);
        double balance=abcAccount.getAccountBalance();
        System.out.println("accountBalance:  "+balance);
        dayaAccount.setSocialSecurityNumber("123456789");
       String lastFourNumberOfSocialSecurityNumber=dayaAccount.getPublicSocialSecurityNumber();
        System.out.println("lastFourDigitOfSSN: " +lastFourNumberOfSocialSecurityNumber);
    }
}
