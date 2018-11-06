
package com.phanxuannam.shoesshop.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductEntity implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    @OneToOne
    @JoinColumn(name = "typeId")
    private CategoryTypeEntity categoryType;
    @OneToOne
    @JoinColumn(name = "providerId")
    private CategoryProviderEntity categoryProvider;
    private String description;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private PriceEntity price;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private Set<ProductDetailsEntity> productDetails;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "promotiondetails",
            joinColumns = {@JoinColumn(name = "productId", referencedColumnName = "productId")},
            inverseJoinColumns = {@JoinColumn(name = "providerId", referencedColumnName = "providerId")})
    Set<PromotionsEntity> listPromotions;
    
    
    public ProductEntity() {
    }

    
    public ProductEntity(int productId, String productName, CategoryTypeEntity categoryType, CategoryProviderEntity categoryProvider, String description) {
        this.productId = productId;
        this.productName = productName;
        this.categoryType = categoryType;
        this.categoryProvider = categoryProvider;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public CategoryTypeEntity getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(CategoryTypeEntity categoryType) {
        this.categoryType = categoryType;
    }

    public CategoryProviderEntity getCategoryProvider() {
        return categoryProvider;
    }

    public void setCategoryProvider(CategoryProviderEntity categoryProvider) {
        this.categoryProvider = categoryProvider;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PriceEntity getPrice() {
        return price;
    }

    public void setPrice(PriceEntity price) {
        this.price = price;
    }

    public Set<ProductDetailsEntity> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(Set<ProductDetailsEntity> productDetails) {
        this.productDetails = productDetails;
    }

    public Set<PromotionsEntity> getListPromotions() {
        return listPromotions;
    }

    public void setListPromotions(Set<PromotionsEntity> listPromotions) {
        this.listPromotions = listPromotions;
    }
    
    
    
    
    
}
