package com.harry.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity // JPA Entity
@Table(name="product") // Maps table to product
@Data // Lombok annotation, reduces boiletplate code
public class Product {
    private Long id;
    private String sku;
    private String name;
    private String description;
    private BigDecimal unitPrice;
    private boolean active;
    private int unitsInStock;
    private Date dateCreated;
    private Date lastUpdated;

}
