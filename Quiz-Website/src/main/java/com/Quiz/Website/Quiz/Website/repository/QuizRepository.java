package com.Quiz.Website.Quiz.Website.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Quiz.Website.Quiz.Website.model.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Long> {
        List<Quiz> findByUsername(String username);
}
