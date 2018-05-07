package com.example.foxex.repository;

import com.example.foxex.doamain.ExchaneValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchaneValue, Long> {
    ExchaneValue findByFromAndTo(String from, String to);

}
