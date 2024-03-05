package com.tunhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunhub.entity.song;

public interface songrepository extends JpaRepository<song,Integer>{
        public song findByName(String name);
}
