package sg.edu.nus.iss;

import java.sql.Date;

public class BankAccount {
    
    private  String name;
    private final String accountNo;
    private float balance = 0.2f;
    private boolean isActive = true;
    private Date accountStartDate;
    private Date accountEndDate;

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public Date getAccountStartDate() {
        return accountStartDate;
    }
    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }
    public Date getAccountEndDate() {
        return accountEndDate;
    }
    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAccountNo() {return accountNo; }
    public float getBalance() { return balance; }
    public void setBalance(float balance) { this.balance = balance; }
    
    public BankAccount(String name, String accountNo, float balance, boolean isActive, Date accountStartDate,
            Date accountEndDate) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
        this.isActive = isActive;
        this.accountStartDate = accountStartDate;
        this.accountEndDate = accountEndDate;
    }
    public BankAccount(String name, String accountNo) {
        this.name = name;
        this.accountNo = accountNo;
    }
    public BankAccount(String name, String accountNo, float balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    

}
