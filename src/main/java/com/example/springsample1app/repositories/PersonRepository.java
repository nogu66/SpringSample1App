package com.example.springsample1app.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springsample1app.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    
    @Query("SELECT d FROM Person d ORDER BY d.name")
    List<Person> findlAllOrderByName();

    public Optional<Person> findById(Long name);
}
