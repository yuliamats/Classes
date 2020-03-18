package by.htp.task09.view;

import by.htp.task09.bean.Book;
import by.htp.task09.bean.Library;

public class LibraryView {
	public void print(Library library) {
		for (Book book : library.getLibrary()) {
			System.out.print("Книга: " + book.getTitle() + "\n");
		}
	}

}
