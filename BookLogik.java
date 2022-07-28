package by.training.exproject.task3;

import java.util.ArrayList;
import java.util.List;

/*Создать класс Book, спецификация которого приведена ниже. 
Определить конструкторы, set- и get- методы и метод  equals. hashCode, toString(). 
Создать второй класс, агрегирующий список типа Book, с подходящими конструкторами и методами. 
Задать критерии выбора данных и вывести эти данные на консоль. 

Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. 

Найти и вывести: 
a) список книг заданного автора; 
b) список книг, выпущенных заданным издательством; 
c) список книг, выпущенных после заданного года.*/

public class BookLogik {
	
	public List<Book> booksByAuthor(Book[] bk, String authors) {
		List<Book> result = new ArrayList<Book>();

		for (Book b : bk) {
			if (authors.equals(b.getAuthors())) {
				result.add(b);
			}
		}
		return result;
	}
	
	public List<Book> booksByPublisher(Book[] bk, String publisher) {
		List<Book> result = new ArrayList<Book>();

		for (Book b : bk) {
			if (publisher.equals(b.getPublisher())) {
				result.add(b);
			}
		}
		return result;
	}
	
	public List<Book> booksByYear(Book[] bk, int yearPublished) {
		List<Book> result = new ArrayList<Book>();

		for (Book b : bk) {
			if (yearPublished <= b.getYearPublished()) {
				result.add(b);
			}
		}
		return result;
	}

}
