package br.com.creativesource.spark.domain;

public class Book {
	
	private String title, author;
	
	public Book(){}

	public Book(String title, String autor) {
		super();
		this.title = title;
		this.author = autor;
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

}
