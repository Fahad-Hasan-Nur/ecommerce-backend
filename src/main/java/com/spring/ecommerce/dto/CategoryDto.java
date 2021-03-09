package com.spring.ecommerce.dto;


import lombok.Data;

@Data
public class CategoryDto {

	private String id;
	private String name;
	private String description;
	private String createdBy;
	private String updatedBy;
}
