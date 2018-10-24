package com.example.book.dao;

import com.example.book.entity.PictureList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureListRepository extends JpaRepository<PictureList,Integer> {
}

