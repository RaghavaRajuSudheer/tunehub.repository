package com.tunhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunhub.entity.tunhub;

public interface tunhubrepository extends JpaRepository<tunhub,Integer>{
    public tunhub findByEmail(String email);
   
}
