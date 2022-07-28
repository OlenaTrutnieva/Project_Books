package by.training.exproject.task3;

import java.util.List;

public class Print {
	public static void printSelectedBooks(List<Book> book) {
		for (Book b : book) {
			System.out.println("Book ID: " + b.getId() + ";  Book title: " + b.getTitle() +  ";  Author: " + b.getAuthors() + ";  Year of publishing: " + b.getYearPublished() + ";  Pages: " + b.getPages() + ";  Book price: " + b.getPrice() + ";  Book cover: " + b.getBookBinding());
		}
		System.out.println();
	}

}
