package com.book.domain;

public class Book {
    /**
     * book_id:图书ID
     * name:图书名称
     * number:图书数量
     * detail:图书描述
     */
    private int bookId;
    private String name;
    private int number;
    private String detail;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
