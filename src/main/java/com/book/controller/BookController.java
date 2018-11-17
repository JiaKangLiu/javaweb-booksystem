package com.book.controller;

import com.book.domain.Book;
import com.book.service.BookSystemService;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.ArrayList;

@Controller
@RequestMapping("book")
public class BookController {
    /**
     * 自动注入BookSystemService
     */
    @Autowired
    @Qualifier("BookSystemService")
    private BookSystemService BookSystemService;

    /**
     * 获取所有图书列表的json数据
     */
    @RequestMapping(value = "/getAllBooks", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getAllBooks(){
        ArrayList<Book> bookArrayList = new ArrayList<Book>();
        bookArrayList = BookSystemService.getAllBooks();
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            System.out.println(mapper.writeValueAsString(bookArrayList));
            json = mapper.writeValueAsString(bookArrayList);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(json);
        return json;
    }
}
