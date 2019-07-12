package com.wangchi.firstspringboot.bms.beans;


import java.util.*;

public class UserBook {

    private int Id;
    private User user;
    private List<Book> books;
    private Date date;//还书日期；

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserBook(int userId, List<Integer> booksId,Date date) {
        this.user = new User(userId);
        this.books=new ArrayList<>();
        for(Integer bookId:booksId) {
            this.books.add(new Book(bookId));
        }
        this.date=date;
      }
    public UserBook(int userId, List<Integer> booksId){
        this.user = new User(userId);
        this.books=new ArrayList<>();
        for(Integer bookId:booksId) {
            this.books.add(new Book(bookId));
        }
    }

    public UserBook() {
    }


}
