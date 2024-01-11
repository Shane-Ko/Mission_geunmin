package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    @Query
    List<Article> findAllByOrderByIdDesc();
    @Query
    List<Article> findByBoardIdOrderByIdDesc(Long boardId);
}
