package com.Sakila.api.SakilaApp;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category")
public class Category {
    //Attributes
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int categoryId;
    @Column(name = "name")
    String categoryName;
    @Column(name = "last_update")
    String categoryUpdate;

    //Constructors

    public Category(int categoryId, String categoryName, String categoryUpdate){
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryUpdate = categoryUpdate;
    }

    public Category() {}

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String category_name) {
        this.categoryName = category_name;
    }

    public String getCategoryUpdate() {
        return categoryUpdate;
    }

    public void setCategoryUpdate(String category_update) {
        this.categoryUpdate = category_update;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return categoryId == category.categoryId && Objects.equals(categoryName, category.categoryName) && Objects.equals(categoryUpdate, category.categoryUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryName, categoryUpdate);
    }
}


