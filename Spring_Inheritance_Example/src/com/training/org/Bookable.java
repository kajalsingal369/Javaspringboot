package com.training.org;

public class Bookable {
 String bookname;
 int bookId;

 Bookable(){
	 this.bookId=0;
	 this.bookname="";
	 }
public Bookable(String bookname, int bookId) {
	super();
	this.bookname = bookname;
	this.bookId = bookId;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
@Override
public String toString() {
	return "Bookable [bookname=" + bookname + ", bookId=" + bookId + "]";
}
 
}
