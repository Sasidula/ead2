package com.example.ead2_item.data;

import jakarta.persistence.*;

import java.sql.Blob;

@Entity
@Table(name="product")
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "itemImg")
    private byte[] itemImg;

    @Column(name = "shortDescription")
    private String shortDescription;

    @Column(name = "price")
    private double price;

    @Column(name = "stockQuantity")
    private int stockQuantity;

    @ManyToOne
    @JoinColumn(name = "categoryid", referencedColumnName = "categoryid")
    private Category category;

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getItemImg() {return itemImg;}

    public void setItemImg(byte[] itemImg) {this.itemImg = itemImg;}

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}