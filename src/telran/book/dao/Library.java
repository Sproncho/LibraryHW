package telran.book.dao;

import telran.book.model.Book;

public class Library {
	private Book[] books;
	private int size;

	public Library(int capacity) {
		books = new Book[capacity];
	}

	public boolean addBook(Book book) {
		if (books.length == size) {
			return false;
		}
		books[size++] = book;
//		size++;
		return true;
	}

	public Book removeBookByTitle(String title) {
		int ind = findBookIndex("Title",title);
		if(ind == -1) return null;
		Book victim = books[ind];
		books[ind] = books[size - 1];
		books[size - 1] = null;
		size--;
		return victim;
	}

	public Book findBookByTitle(String title) {
		int ind = findBookIndex("Title",title);
		if(ind == -1) return null;
		return books[ind];
	}


	public Book updateBook(String author, String newAuthor) {
		int ind = findBookIndex("Author",author);
		if(ind == -1) return null;
		books[ind].setAuthor(newAuthor);
		return books[ind];
	}

	private  int findBookIndex(String searchBy,String argument){
		for (int i = 0; i < size; i++) {
			if(searchBy.equals("Author") && books[i].getAuthor().equals(argument) || searchBy.equals("Title") && books[i].getTitle().equals(argument)){
				return i;
			}
		}
		return -1;
	}
	public void printBooks() {
		for (int i = 0; i < size; i++) {
			System.out.println(books[i]);
		}
	}

	public void printBooks(int fromYear){
		for (int i = 0; i < size; i++) {
			if(books[i].getYearOfPublishing() >= fromYear){
				System.out.println(books[i]);
			}
		}
	}

	public void printBooks(int fromYear, int toYear){
		for (int i = 0; i < size; i++) {
			if(books[i].getYearOfPublishing() >= fromYear && books[i].getYearOfPublishing() <= toYear){
				System.out.println(books[i]);
			}
		}
	}
	public void printBooks(String author){
		for (int i = 0; i <  size; i++) {
			if(author.equals(books[i].getAuthor())){
				System.out.println(books[i]);
			}
		}
	}
	public int getSize() {
		return size;
	}
}
