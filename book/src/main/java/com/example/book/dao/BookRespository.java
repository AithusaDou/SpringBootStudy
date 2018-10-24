package com.example.book.dao;

import com.example.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 98100 on 2018/9/20.
 */
public interface BookRespository extends JpaRepository<Book,Integer> {
}
