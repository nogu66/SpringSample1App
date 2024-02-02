package com.example.springsample1app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springsample1app.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
