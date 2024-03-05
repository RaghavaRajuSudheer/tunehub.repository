package com.tunhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunhub.entity.folder;

public interface repository extends JpaRepository<folder,String>{
//     public folder findByName(String name);

	
}
