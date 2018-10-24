package com.example.book.service.Impl;

import com.example.book.dao.BookRespository;
import com.example.book.entity.Book;
import com.example.book.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by 98100 on 2018/9/20.
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookRespository bookRespository;

    @Override
    @Transactional
    public Book save(Book book) {
        return bookRespository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRespository.findAll();
    }

    @Override
    public Book get(int id) {
        return bookRespository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        bookRespository.deleteById(id);
    }


}
