package com.example.demo.model;
import jakarta.persistence.*;
import lombok.*;
//Entity classes (DB tables)
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long id;
        
        private String name;
        private double price;
        
        public Product() {}

        public Long getId() { return id; }
        public String getName() { return name; }
        public double getPrice() { return price; }

        public void setName(String name) { this.name = name; }
        public void setPrice(double price) { this.price = price; }
        
}
