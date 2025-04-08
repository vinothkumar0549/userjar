package com.example.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    
    private int userid;
    private String name;

    @JsonProperty("password")
    private String encryptedpassword;
    private RoleType role;
    private int accountno;
    private double balance;
    private long mobilenumber;
    private long aadhaar;
    private int transactioncount;
    
    public User(String name, String encryptedpassword, RoleType role, long mobilenumber, long aadhaar) {
        this.name = name;
        this.encryptedpassword = encryptedpassword;
        this.role = role;
        this.mobilenumber = mobilenumber;
        this.aadhaar = aadhaar;
    }

    //Test Cases Updated
    public User(String name, String encryptedpassword, RoleType role) {
        this.name = name;
        this.encryptedpassword = encryptedpassword;
        this.role = role;
    }

    public User(int userid, String name, String encryptedpassword, RoleType role, int accountno, double balance, long mobilenumber, long aadhaar, int transactioncount) {
        this.userid = userid;
        this.name = name;
        this.encryptedpassword = encryptedpassword;
        this.role = role;
        this.accountno = accountno;
        this.balance = balance;
        this.mobilenumber = mobilenumber;
        this.aadhaar = aadhaar;
        this.transactioncount = transactioncount;
    }

    public User() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEncryptedpassword() {
        return encryptedpassword;
    }

    public void setEncryptedpassword(String encryptedpassword) {
        this.encryptedpassword = encryptedpassword;
    }

    public RoleType getRole() {
        return role;
    }

    public void setRole(RoleType role) {
        this.role = role;
    }
    
    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public long getAadhaar() {
        return aadhaar;
    }

    public void setAadhaar(long aadhaar) {
        this.aadhaar = aadhaar;
    }

    public int getTransactioncount(){
        return transactioncount;
    }

    public void setTransactioncount(int transactioncount){
        this.transactioncount = transactioncount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%n", userid, name, encryptedpassword, role, accountno, balance, mobilenumber, aadhaar, transactioncount));
        return sb.toString();    
    }

}

