package com.example.test.repository;

import com.example.test.entity.entity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface repository extends JpaRepository<entity, Long>{

}
