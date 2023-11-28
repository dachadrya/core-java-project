package oopconcept;

public class BankAccount{
    String accountHolderName;
    String accountNumber;
   AccountType accountType;
    double accountBalance;
    String routingNumber;
    String socialSecurityNumber;
    String accountHolderAddress;
    String accountHolderDOB;
    String accountHolderGender;
    String  accountHolderPhoneNumber;
    String accountHolderEmail;
    Boolean isMinorAccount;
    final String BANK_NAME="Bank of Amrica";

    public static void main(String[] args) {
        BankAccount dayaAccount = new BankAccount();
        BankAccount abcAccount = new BankAccount();

        System.out.println(dayaAccount.BANK_NAME);
        dayaAccount.accountType=AccountType.CHECKING;
        System.out.println(dayaAccount.accountType);
    }

}
