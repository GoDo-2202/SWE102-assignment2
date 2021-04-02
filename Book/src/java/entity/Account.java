/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author dinhg
 */
public class Account {
    private int uID;
    private String user;
    private String pass;
    private int issell;
    private int isAdmin;

    public Account(int uID, String user, String pass, int issell, int isAdmin) {
        this.uID = uID;
        this.user = user;
        this.pass = pass;
        this.issell = issell;
        this.isAdmin = isAdmin;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getIssell() {
        return issell;
    }

    public void setIssell(int issell) {
        this.issell = issell;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Account{" + "uID=" + uID + ", user=" + user + ", pass=" + pass + ", issell=" + issell + ", isAdmin=" + isAdmin + '}';
    }
    
    
}
