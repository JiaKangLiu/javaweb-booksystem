package com.book.service.impl;

import com.book.dao.BookDao;
import com.book.domain.Book;
import com.book.service.BookSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("BookSystemService")
public class BookSystemServiceImpl implements BookSystemService {
    /**
     * 自动注入DAO对象
     */
    @Autowired
    BookDao bookDao;

    /**
     * @param 空
     * @return 获取所有图书列表的json数据
     * @author 刘家康
     */
    @Override
    public ArrayList<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }
}
