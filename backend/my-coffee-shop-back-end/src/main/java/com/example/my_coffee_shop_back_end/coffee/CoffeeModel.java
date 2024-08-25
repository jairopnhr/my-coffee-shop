package com.example.my_coffee_shop_back_end.coffee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.example.my_coffee_shop_back_end.Image.ImageModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

@Entity
public class CoffeeModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    private BigDecimal price;

    private String description;
   
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "coffee_ingredients", joinColumns = @JoinColumn(name = "coffee_id"))
    @Column(name = "ingredients")
    private List<String> ingredients;
    
    @Enumerated(EnumType.STRING)
    private Size size;

    @Enumerated(EnumType.STRING)
    private CoffeeType type;

    private boolean availability ;
    @Column(updatable = false ,name = "created_at")
    private LocalDate createAt; 

    @Column(name = "updated_at")
    private LocalDate updateAt;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "coffee_id")
    private List<ImageModel>images;

    private String origin;
    
    private double rating;
    @Enumerated(EnumType.STRING)
    @Column(name="category")
    private Category category;

    private Integer calories;

    @PreUpdate
    protected void onUpdate()
    {
        this.updateAt = LocalDate.now();
    }
    @PrePersist
    protected void onCreate()
    {
        this.createAt = LocalDate.now();
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<String> getIngredients() {
        return ingredients;
    }
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public CoffeeType getType() {
        return type;
    }
    public void setType(CoffeeType type) {
        this.type = type;
    }
    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public LocalDate getCreateAt() {
        return createAt;
    }
    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }
    public LocalDate getUpdateAt() {
        return updateAt;
    }
    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }
    public List<ImageModel> getImages() {
        return images;
    }
    public void setImages(List<ImageModel> images) {
        this.images = images;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public Integer getCalories() {
        return calories;
    }
    public void setCalories(Integer calories) {
        this.calories = calories;
    }
    
}
