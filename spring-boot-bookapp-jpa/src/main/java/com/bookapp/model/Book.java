package com.bookapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "book_details") 
public class Book{
	private String title;
	@Id //this is must
	@GeneratedValue //to auto generate id
    private Integer bookId;
	@Column(name = "cost")
    private double price;
	@Column(length = 20)
    private String author;
    private String category;
}
