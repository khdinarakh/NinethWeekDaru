package com.company.book;

public class Book {

    private String title;
    private String content;
    private String author;

    public Book(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {

    }


    public class Description {
        private Book details;

        public Description() {
        }

        public Description(Book details) {
            this.details = details;
        }


        public void display() {
            System.out.println("Book Details:");
            System.out.println("Title: " + details.getTitle());
            System.out.println("Author: " + details.getAuthor());
            System.out.println("Content: " + details.getContent());
            System.out.println("---------------------");

        }
    }
}
