package com.Sakila.api.SakilaApp;


import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    //Attributes
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int categoryId;
    @Column(name = "name")
    String category_name;
    @Column(name = "last_update")
    String category_update;

    //Constructors

    public Category(int categoryId, String category_name, String category_update){
        this.categoryId = categoryId;
        this.category_name = category_name;
        this.category_update = category_update;
    }

    public Category() {}

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return category_name;
    }

    public void setCategoryName(String category_name) {
        this.category_name = category_name;
    }

    public String getCategoryUpdate() {
        return category_update;
    }

    public void setCategoryUpdate(String category_update) {
        this.category_update = category_update;
    }
}


