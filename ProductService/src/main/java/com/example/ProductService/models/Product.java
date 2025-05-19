package com.example.ProductService.models;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity{

    private String name;
    private String description;
    private String image;
    @Column(precision = 10 , scale = 2)
    private BigDecimal price;

    @OneToMany(mappedBy = "product" , cascade = CascadeType.ALL)
    private List<Variant> variantList;

}
