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
        
}
