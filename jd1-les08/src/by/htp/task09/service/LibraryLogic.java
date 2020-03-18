package by.htp.task09.service;

import by.htp.task09.bean.Book;
import by.htp.task09.bean.Library;

public class LibraryLogic {
	public Library findBookByAuthor(Library library, String author) {
		Library result = new Library();

		for (Book book : library.getLibrary()) {
			if (book.getAuthor().compareTo(author) == 0) {
				result.addBook(book);
			}
		}
		return result;
	}

	public Library findBookByPublishingHouse(Library library, String publishingHouse) {
		Library result = new Library();

		for (Book book : library.getLibrary()) {
			if (book.getPublishingHouse().compareTo(publishingHouse) == 0) {
				result.addBook(book);
			}
		}
		return result;
	}

	public Library findBookByYearPublished(Library library, int from) {
		Library result = new Library();

		for (Book book : library.getLibrary()) {
			if (book.getYearPublished() > from) {
				result.addBook(book);
			}
		}
		return result;
	}
}
