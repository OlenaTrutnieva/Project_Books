package by.training.exproject.task3;

import java.util.Objects;

/*Создать класс Book, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод  equals. hashCode, toString(). 
Создать второй класс, агрегирующий список типа Book, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль. 

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. 

Найти и вывести: 
a) список книг заданного автора; 
b) список книг, выпущенных заданным издательством; 
c) список книг, выпущенных после заданного года.*/

public class Book {

	private int id;
	private String title;
	private String authors;
	private String publisher;
	private int yearPublished;
	private int pages;
	private double price;
	private String bookBinding;


	public Book() {
		id = 0;
		title = "";
		authors = "";
		publisher = "";
		yearPublished = 0;
		pages = 0;
		price = 0;
		bookBinding = "";
	}

	public Book(int id, String title, String authors, String publisher, int yearPublished, int pages, double price,
			String bookBinding) {
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.pages = pages;
		this.price = price;
		this.bookBinding = bookBinding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBookBinding() {
		return bookBinding;
	}

	public void setBookBinding(String bookBinding) {
		this.bookBinding = bookBinding;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", authors=" + authors + ", publisher=" + publisher
				+ ", yearPublished=" + yearPublished + ", pages=" + pages + ", price=" + price + ", bookBinding="
				+ bookBinding + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(authors, bookBinding, id, pages, price, publisher, title, yearPublished);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authors, other.authors) && Objects.equals(bookBinding, other.bookBinding)
				&& id == other.id && pages == other.pages
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publisher, other.publisher) && Objects.equals(title, other.title)
				&& yearPublished == other.yearPublished;
	}

}
