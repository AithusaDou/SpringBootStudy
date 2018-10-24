package com.example.quartz.dao;

import com.example.quartz.entity.Sports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SportsRepository extends JpaRepository<Sports,Integer> {
    @Query("FROM Sports a WHERE DATEDIFF(a.date,NOW())=0 ORDER BY a.number DESC")
    List<Sports> find();


    @Query("from Sports u WHERE DATEDIFF(u.date,NOW())=0 and u.account = :account")
    Sports findUser(@Param("account") String account);

}
