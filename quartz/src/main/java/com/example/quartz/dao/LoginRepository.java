package com.example.quartz.dao;

import com.example.quartz.entity.SportsUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface LoginRepository extends JpaRepository<SportsUser,Integer> {
    @Query("from SportsUser u where u.account = :account")
    SportsUser findUser(@Param("account") String account);


}
