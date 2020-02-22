package Lab5Book;

public class Book {
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private static int bookCopy;
	public Book(String bookName, String bookAuthor, String bookId, String bookType, int bookCopy) {
		//super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
		this.bookCopy = bookCopy;
	}

	public Book(){

	}

	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
	public String getBookAuthor() {
		return bookAuthor;
	}
		
		
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
	public String getBookId() {
		return bookId;
	}
		
		
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
		
		
	public String getBookType() {
		return bookType;
	}


	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	
	public int getBookCopy() {
		return bookCopy;
	}
	
	
	public void setBookCopy(int bookCopy) {
		this.bookCopy = bookCopy;
	}
	
	
	public void showInfo(){
		System.out.println(bookName + " " +bookAuthor + " " + bookId+ " " +bookType);
	}
	
	public void addBookCopy(int add) {
		bookCopy = bookCopy + add;
	}
	
	static public int bookCounter(){
		return bookCopy;
	}
	
	public void showTotalBookInfi(){
		System.out.println("book Name: "+bookName + " book Author: " +bookAuthor + " book Id: " + bookId+ " book Type: " +bookType+ " No. of copy:"+bookCopy);
	}
}
