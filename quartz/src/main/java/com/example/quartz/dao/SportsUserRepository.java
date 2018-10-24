package com.example.quartz.dao;

import com.example.quartz.entity.SportsUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportsUserRepository extends JpaRepository<SportsUser,Integer> {
}
