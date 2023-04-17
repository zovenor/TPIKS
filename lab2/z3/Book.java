package lab2.z3;

import java.util.Scanner;

public class Book {
    private String author;
    private String title;
    private int year;
    private int pageCount;

    public Book() {
    }

    public Book(String author, String title, int year, int pageCount) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void printBookInfo(String bookTitle) {
        if (bookTitle.equals(title)) {
            System.out.println("Author: " + author);
            System.out.println("Name: " + title);
            System.out.println("Year of release: " + year);
            System.out.println("Number of pages: " + pageCount);
        } else {
            System.out.println("Book with name \"" + bookTitle + "\" is not found.");
        }
    }

    public void setAuthor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the author: ");
        author = scanner.nextLine();
    }

    public void setTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        title = scanner.nextLine();
    }

    public void setYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = scanner.nextInt();
    }

    public void setPageCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of pages: ");
        pageCount = scanner.nextInt();
    }

    public static void main(String[] args) {
        Book book1 = new Book("Swaroop C.H.", "Byte of python", 2004, 149);
        book1.printBookInfo("Book version 1.90 for Python version 3.0");
        book1.setAuthor();
        book1.setTitle();
        book1.setYear();
        book1.setPageCount();
        book1.printBookInfo("Book version 1.90 for Python version 3.0");
    }
}