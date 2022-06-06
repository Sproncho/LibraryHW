package telran.book.controller;

import telran.book.dao.Library;
import telran.book.model.Book;

public class LibraryAppl {

	public static void main(String[] args) {
		Library lib = new Library(8);
		lib.addBook(new Book(2000000000000l, "Book0", 1988));
		lib.addBook(new Book(3000000000000l, "Book1", "Author1", 1998));
		lib.addBook(new Book(4000000000000l, "Book2", "Author1", 1995));
		System.out.println(lib.addBook(new Book(5000000000000l, "Book3", "Author2", 1990)));
		System.out.println(lib.addBook(new Book(6000000000000l, "Book4", 1981)));
		System.out.println(lib.getSize());
		System.out.println();
		lib.printBooks();
		System.out.println();
		lib.printBooks(1990);
		System.out.println();
		lib.printBooks(1990,1995);
		System.out.println();
		lib.printBooks("Author1");
		System.out.println();
		System.out.println("deleting");
		lib.printBooks();
		lib.removeBookByTitle("Book2");
		System.out.println();
		lib.printBooks();
		System.out.println();
		System.out.println("updating");
		lib.printBooks();
		lib.updateBook("Author2","Author100");
		System.out.println();
		lib.printBooks();
	}

}
