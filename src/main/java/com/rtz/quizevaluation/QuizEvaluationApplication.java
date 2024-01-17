package com.rtz.quizevaluation;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rts.evaluation.controller.QuizController;
import com.rts.evaluation.model.Quiz;
import com.rts.evaluation.repository.QuizDAO;

@SpringBootApplication
public class QuizEvaluationApplication {

	static QuizDAO dao = new QuizDAO();

	public Quiz menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter question number, question, category, answer1, answer2, answer3, rightanswer");

		return new Quiz(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
	}

	public static void main(String[] args) {
		SpringApplication.run(QuizEvaluationApplication.class, args);
		QuizEvaluationApplication obj = new QuizEvaluationApplication();

		Quiz bean = obj.menu();

		QuizController control = new QuizController();
		control.performInsert(bean);

	}

}
