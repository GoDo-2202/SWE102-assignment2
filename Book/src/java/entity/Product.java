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
public class Product {
    private int id;
    private String name;
    private String author;
    private String image;
    private double price;
    private String category;
    private String description;

    public Product() {
    }
    
    public Product(int id, String name, String author, String image, double price, String category, String description) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.image = image;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", author=" + author + ", image=" + image + ", price=" + price + ", category=" + category + ", description=" + description + '}';
    }
    
    
}
