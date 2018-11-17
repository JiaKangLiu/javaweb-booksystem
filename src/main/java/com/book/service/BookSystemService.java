package com.book.service;


import com.book.domain.Book;

import java.util.ArrayList;

public interface BookSystemService {
    /**
     * @param 空
     * @return 所有图书列表的json数据
     * @author 刘家康
     */
    ArrayList<Book> getAllBooks();
}
