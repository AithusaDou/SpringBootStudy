package com.example.book.service;

import com.example.book.entity.Book;

import java.util.List;

/**
 * Created by 98100 on 2018/9/20.
 */
public interface BookService {
    Book save(Book book);

    List<Book> getAll();

    Book get(int id);

    void delete(int id);
}
