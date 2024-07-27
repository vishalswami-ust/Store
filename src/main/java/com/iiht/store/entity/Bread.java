package com.iiht.store.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Bread {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idB;
	private double price;
	private int quantity;
}
