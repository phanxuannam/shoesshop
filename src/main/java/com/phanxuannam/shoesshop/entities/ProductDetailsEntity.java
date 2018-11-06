
package com.phanxuannam.shoesshop.entities;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productdetails")
public class ProductDetailsEntity implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productDetailId;
     
     @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productId")
    private ProductEntity product;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "colorId")
    private ProductColorEntity productColor;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sizeId")
    private ProductSizeEntity productSize;
    private String inputDate;
    private String quantity;

    public ProductDetailsEntity() {
    }

    public int getProductDetailId() {
        return productDetailId;
    }

    public void setProductDetailId(int productDetailId) {
        this.productDetailId = productDetailId;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }

    public ProductColorEntity getProductColor() {
        return productColor;
    }

    public void setProductColor(ProductColorEntity productColor) {
        this.productColor = productColor;
    }

    public ProductSizeEntity getProductSize() {
        return productSize;
    }

    public void setProductSize(ProductSizeEntity productSize) {
        this.productSize = productSize;
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    
}
