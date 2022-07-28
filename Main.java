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

public class Main {

	public static void main(String[] args) {
		Book[] book = new Book[5];
		
		book[0] = new Book(100, "Java", "Gosling", "Zvezda", 2019, 208, 34.70, "Hard cover");
		book[1] = new Book(101, "C++", "Gosling", "Partizan", 2020, 378, 70.48, "Hard cover");
		book[2] = new Book(102, "Azbuka", "Zhukova", "Zvezda", 2018, 48, 31.90, "Soft cover");
		book[3] = new Book(103, "Fairy Tales", "Andersons", "Rassvet", 2021, 78, 64.70, "Hard cover");
		book[4] = new Book(104, "Fairy Tales", "Andersons", "Zvezda", 2019, 102, 34.70, "Soft cover");
		
		BookLogik logic = new BookLogik();
		List<Book> byAuthor = logic.booksByAuthor(book, "Gosling");
		
		Print outPrint = new Print();
		
		
		outPrint.printSelectedBooks(byAuthor);
		
		List<Book> byPublisher = logic.booksByPublisher(book, "Zvezda");
		
		outPrint.printSelectedBooks(byPublisher);
		
		List<Book> byYear = logic.booksByYear(book, 2019);
		
		outPrint.printSelectedBooks(byYear);
	
	}
	
	
	
	

}
