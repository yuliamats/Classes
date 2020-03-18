package by.htp.task09.main;

import by.htp.task09.bean.Book;
import by.htp.task09.bean.Library;
import by.htp.task09.service.LibraryLogic;
import by.htp.task09.view.LibraryView;

//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
//toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
//Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

public class Main {
	public static void main(String[] args) {
		
	Library library = new Library();
	library.addBook(new Book(1, "Филосифия JAVA", "Эккель", "Питер", 2019, 1168, 74.90, "твердый переплет"));
	library.addBook(new Book(2, "JAVA базовый курс", "Хорстманн", "Вильямс", 2018, 576, 90.10, "мягкая обложка"));
	library.addBook(new Book(3, "JAVA Библиотека профессионала", "Хорстманн", "Вильямс", 2019, 864, 118.80, "твердый переплет"));
	library.addBook(new Book(4, "JAVA Эффективное программирование", "Блох", "ДМК", 2013, 294, 29.85, "мягкая обложка"));
	library.addBook(new Book(5, "Изучаем JAVA", "Бейтс", "Питер", 2019, 720, 46.66, "твердый переплет"));
	library.addBook(new Book(6, "Изучаем С++", "Грин", "Питер", 2020, 816, 68.55, "мягкая обложка"));
	
	LibraryLogic libLogic = new LibraryLogic();
	libLogic.findBookByAuthor(library, "Хорстманн");
	libLogic.findBookByPublishingHouse(library, "Питер");	
	libLogic.findBookByYearPublished(library, 2015);
	
	LibraryView libView = new LibraryView();
	System.out.println("список книг заданного автора:");
	libView.print(libLogic.findBookByAuthor(library, "Хорстманн"));
	
	System.out.println("список книг, выпущенных заданным издательством:");
	libView.print(libLogic.findBookByPublishingHouse(library, "Питер"));
	
	System.out.println("список книг, выпущенных после заданного года:");
	libView.print(libLogic.findBookByYearPublished(library, 2015));
	}

}
