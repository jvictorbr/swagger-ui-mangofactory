package com.jv;

import java.io.Serializable;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel("Book")
public class Book implements Serializable {

	private static final long serialVersionUID = 498435419677375106L;

	@ApiModelProperty("The book isbn code")
	private Long isbn;

	@ApiModelProperty("The book title")
	private String title;

	@ApiModelProperty("The book author name")
	private String author;

	@ApiModelProperty("The book edition")
	private String edition;

	@ApiModelProperty("The year when book was published")
	private Integer year;

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
