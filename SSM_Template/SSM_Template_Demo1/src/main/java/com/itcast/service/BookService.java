package com.itcast.service;

import com.itcast.domain.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookService {
    /**
     * 查询所有书
     * @return
     */
    @Select("select * from book")
    List<Book> findAllBook();

    /**
     * 根据id查询书
     * @param bid
     * @return
     */
    @Select("select * from book where bid = #{bid}")
    Book findBookById(Integer bid);
}
