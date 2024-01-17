package com.rts.evaluation.model;

public class Quiz {

	private int queNo;
	private String queText;
	private String queCategory;
	private String answer1;
	private String answer2;
	private String answer3;
	private String rightAnswer;

	public Quiz() {
		super();
	}

	public Quiz(int queNo, String queText, String queCategory, String answer1, String answer2, String answer3,
			String rightAnswer) {
		super();
		this.queNo = queNo;
		this.queText = queText;
		this.queCategory = queCategory;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.rightAnswer = rightAnswer;
	}

	public int getQueNo() {
		return queNo;
	}

	public void setQueNo(int queNo) {
		this.queNo = queNo;
	}

	public String getQueText() {
		return queText;
	}

	public void setQueText(String queText) {
		this.queText = queText;
	}

	public String getQueCategory() {
		return queCategory;
	}

	public void setQueCategory(String queCategory) {
		this.queCategory = queCategory;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getAnswer3() {
		return answer3;
	}

	public void setAnswer3(String answer3) {
		this.answer3 = answer3;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

	@Override
	public String toString() {
		return "Quiz [queNo=" + queNo + ", queText=" + queText + ", queCategory=" + queCategory + ", answer1=" + answer1
				+ ", answer2=" + answer2 + ", answer3=" + answer3 + ", rightAnswer=" + rightAnswer + "]";
	}

}
