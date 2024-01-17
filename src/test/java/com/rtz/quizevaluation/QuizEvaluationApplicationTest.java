/*package com.rtz.quizevaluation;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.rts.evaluation.model.Quiz;
import com.rts.evaluation.repository.QuizDAO;

public class QuizEvaluationApplicationTest {

	@Autowired
	static QuizDAO dao;
	Quiz bean = new Quiz(1, "What is National Bird?", "General Knowledge", "peacock", "crow", "hen", "peacock");

	@Test
	void contextLoads() {
	}

	@Test
	public void testPerformInsert() {
		dao = new QuizDAO();
		boolean value = dao.insert(bean);
		assertEquals(value, true);

	}
}*/
