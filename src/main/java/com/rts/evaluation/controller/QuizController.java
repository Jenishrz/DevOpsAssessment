package com.rts.evaluation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rts.evaluation.model.Quiz;
import com.rts.evaluation.repository.QuizDAO;

public class QuizController {
	@Autowired
	static QuizDAO dao;

	public void performInsert(Quiz bean) {
		dao.insert(bean);
		System.out.println("Inserted");
		List<Quiz> list = dao.view();
		System.out.println(list);
	}
}
