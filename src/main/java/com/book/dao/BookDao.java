package com.book.dao;

import com.book.domain.Book;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

public interface BookDao {
    /**
     * @param 空
     * @return 所有图书对象的列表ArrayList
     * @author 刘家康
     */
    @Select("select book_id as bookId, name, number, detail from book")
    ArrayList<Book> getAllBooks();
}
