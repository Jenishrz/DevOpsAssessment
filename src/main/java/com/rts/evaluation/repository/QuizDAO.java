package com.rts.evaluation.repository;

import java.util.ArrayList;
import java.util.List;

import com.rts.evaluation.model.Quiz;

public class QuizDAO {
	static List<Quiz> list;

	public static boolean insert(Quiz bean) {
		list = new ArrayList<Quiz>();
		return list.add(bean);
	}

	public static List<Quiz> view() {
		return list;
	}
}
