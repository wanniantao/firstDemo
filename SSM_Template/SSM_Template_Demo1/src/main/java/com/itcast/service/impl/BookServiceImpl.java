package com.itcast.service.impl;

import com.itcast.dao.BookDao;
import com.itcast.domain.Book;
import com.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("bookServiceImpl")
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao dao;
    public List<Book> findAllBook() {
        return dao.findAllBook();
    }

    public Book findBookById(Integer bid) {
        return dao.findBookById(bid);
    }
}
