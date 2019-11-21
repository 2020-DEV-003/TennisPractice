package com.kata.util;

public enum ScoreEnum {

	ADVANTAGE(" Advantage"), WINS(" Wins"), DEUCE("Deuce"), ALL(" All");

	public final String value;

	private ScoreEnum(String value) {
		this.value = value;
	}

}
