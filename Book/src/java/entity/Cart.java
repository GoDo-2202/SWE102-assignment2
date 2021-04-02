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
public class Cart {

    private int accountID;
    private int productID;
    private int productName;
    private int quantity;
    private int amount;
    private int total;

    public Cart(int accountID, int productID, int productName, int quantity, int amount, int total) {
        this.accountID = accountID;
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.amount = amount;
        this.total = total;
    }

    public int getProductName() {
        return productName;
    }

    public void setProductName(int productName) {
        this.productName = productName;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Cart{" + "accountID=" + accountID + ", productID=" + productID + ", productName=" + productName + ", quantity=" + quantity + ", amount=" + amount + ", total=" + total + '}';
    }

    
}
