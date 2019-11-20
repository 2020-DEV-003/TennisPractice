package com.kata;

/**
 * 
 * Description : This class contain logic for Tennis Game
 *
 */
public class Game {

	private String playerOneName;
	private String playerTwoName;

	public Game(String playerOneName, String playerTwoName) {
		this.playerOneName = playerOneName;
		this.playerTwoName = playerTwoName;
	}

	public String getScore(int playerOneScore, int playerTwoScore) {
		if (isWins(playerOneScore, playerTwoScore)) {
			if (playerOneScore > playerTwoScore) {
				return playerOneName + " Wins";
			} else {
				return playerTwoName + " Wins";
			}
		}

		if (isAdvantage(playerOneScore, playerTwoScore)) {
			if (playerOneScore > playerTwoScore) {
				return playerOneName + " Advantage";
			} else {
				return playerTwoName + " Advantage";
			}
		}
		if (isDeuce(playerOneScore, playerTwoScore)) {
			return "Deuce";
		}
		if (isAll(playerOneScore, playerTwoScore)) {
			return convertScore(playerOneScore) + " All";
		}
		return convertScore(playerOneScore) + "," + convertScore(playerTwoScore);
	}

	private boolean isWins(int playerOneScore, int playerTwoScore) {
		if (playerOneScore >= 4 && playerTwoScore == playerOneScore - 2) {
			return true;
		}
		if (playerTwoScore >= 4 && playerOneScore == playerTwoScore - 2) {
			return true;
		}
		return false;
	}

	private boolean isAdvantage(int playerOneScore, int playerTwoScore) {
		if (playerOneScore > playerTwoScore && playerTwoScore >= 3) {
			return true;
		}
		if (playerOneScore < playerTwoScore && playerOneScore >= 3) {
			return true;
		}
		return false;
	}

	private boolean isDeuce(int playerOneScore, int playerTwoScore) {
		if (playerOneScore == playerTwoScore && playerOneScore >= 3) {
			return true;
		}
		return false;
	}

	private boolean isAll(int playerOneScore, int playerTwoScore) {
		if (playerOneScore == playerTwoScore && playerOneScore <= 3) {
			return true;
		}

		return false;
	}

	private String convertScore(int score) {
		switch (score) {
		case 3:
			return "Forty";
		case 2:
			return "Thirty";
		case 1:
			return "Fifteen";
		case 0:
			return "Love";
		}
		throw new IllegalArgumentException("Illegal score: " + score);
	}

}
