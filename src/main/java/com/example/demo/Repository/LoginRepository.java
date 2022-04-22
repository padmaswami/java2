package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.classes.farmer;

public interface LoginRepository extends JpaRepository<farmer,Integer>{

}
