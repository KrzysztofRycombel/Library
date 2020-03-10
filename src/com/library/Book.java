package com.library;

import java.util.ArrayList;
import java.util.List;

public class Book {

    public int id;
    public String  title;
    public String author;
    public Boolean borrow;


    public Book(int id, String title, String author, Boolean borrow) {

        this.id=id;
        this.title=title;
        this.author=author;
        this.borrow=borrow;

    }
    public Book(List<Book> volume) {

        this.volume=volume;

    }

    List<Book> volume = new ArrayList<>();

    public void showBooks() {
        for(Book i : volume) {
            i.showBook();
        }
    }
    public void showBook() {
        System.out.println("Indeks: "+id+"\tTytul: "+title+ "\tAutor: "+author+"\tWypożyczona: "+borrow);
    }
}