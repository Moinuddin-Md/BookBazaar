package com.book.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
@Entity
public class BookCategory 
{
	@Id
	@GeneratedValue(generator = "cat_seq")
	@SequenceGenerator(name = "cat_seq",sequenceName = "CAT_SEQ",initialValue = 111)
	private int cat_id;
	private String category;
	private String description;
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
