/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phanxuannam.shoesshop.entities;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "categorytype")
public class CategoryTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int typeId;
    private String typeName;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "typeId")
    private Set<ProductEntity> product;

    public CategoryTypeEntity() {
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Set<ProductEntity> getProduct() {
        return product;
    }

    public void setProduct(Set<ProductEntity> product) {
        this.product = product;
    }

  
    
    
}
