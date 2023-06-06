package com.example.wedding.repository;

import com.example.wedding.entity.Gift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGiftRepository extends JpaRepository<Gift, Long> {


}
