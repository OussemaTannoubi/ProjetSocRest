package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Traffic {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String gouv;
	private String location;
	private String duration;
	private String description;
	@Enumerated(EnumType.STRING)
	private Severity severity;
}
