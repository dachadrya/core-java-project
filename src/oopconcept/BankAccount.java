package oopconcept;

public class BankAccount{
  private  String accountHolderName;
   private String accountNumber;
    private AccountType accountType;
    private double accountBalance;
    private String routingNumber;
    private String socialSecurityNumber;
    private String publicSocialSecurityNumber;

    private  String accountHolderAddress;
    private  String accountHolderDOB;
    private Gender accountHolderGender;
    private  String  accountHolderPhoneNumber;
    private  String accountHolderEmail;
    private  Boolean isMinorAccount;
    private final String BANK_NAME = "Bank of America";

  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }
  public String getAccountHolderName(){
    return this.accountHolderName;
  }


  public void setAccountNumber(String AccountNumber){
    this.accountNumber=accountNumber;
  }

  public String getAccountNumber() {
    return accountNumber;
  }



  public void setAccountType(AccountType accountType) {

    this.accountType = accountType;
  }
  private AccountType getAccountType(){

    return this.accountType;
  }



  public void setAccountBalance(double accountBalance){

    this.accountBalance=accountBalance;
  }
  public double getAccountBalance() {

    return this.accountBalance;
  }


  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }

  public String getRoutingNumber() {

    return this.routingNumber;
  }



  public void setSocialSecurityNumber(String socialSecurityNumber) {

    this.socialSecurityNumber = socialSecurityNumber;
    this.publicSocialSecurityNumber=socialSecurityNumber.substring(socialSecurityNumber.length()-4);
  }
  public String getPublicSocialSecurityNumber(){
    return this.publicSocialSecurityNumber;
  }

  public void setAccountHolderAddress(String accountHolderAddress){

    this.accountHolderAddress=accountHolderAddress;
  }
  public String getAccountHolderAddress(){

    return this.accountHolderAddress;
  }

  public void setAccountHolderDOB(String accountHolderDOB){

    this.accountHolderDOB=accountHolderDOB;
  }
  public String getAccountHolderDOB(){

    return this.accountHolderDOB;
  }

  public void setAccountHolderGender(Gender accountHolderGender){

    this.accountHolderGender=accountHolderGender;
  }
  public Gender getAccountHolderGender() {

    return accountHolderGender;
  }

  public void setAccountHolderPhoneNumber(String accountHolderPhoneNumber){
    this.accountHolderPhoneNumber=accountHolderPhoneNumber;
  }
  public String getAccountHolderPhoneNumber(){
    return this.accountHolderPhoneNumber;
  }

  public void setAccountHolderEmail(String accountHolderEmail) {

    this.accountHolderEmail = accountHolderEmail;
  }
  public String getAccountHolderEmail() {
    return this.accountHolderEmail;
  }

  public void setMinorAccount(Boolean isMinorAccount) {

    this.isMinorAccount = isMinorAccount;
  }
  public Boolean getMinorAccount() {
    return this.isMinorAccount;
  }

  public String getBANK_NAME() {
    return BANK_NAME;
  }
}
