package com.paul.dao;

import com.paul.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

    @Query(value = "SELECT * FROM (SELECT * FROM QUESTION WHERE CATEGORY = ?1 ORDER BY DBMS_RANDOM.VALUE) WHERE ROWNUM <= ?2", nativeQuery = true)
    List<Question> findRandomQuestionByCategory(String category, int numQ);

}
