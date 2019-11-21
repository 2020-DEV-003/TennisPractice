package com.kata.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.kata.Player;
import com.kata.TennisGame;

public class TennisGameTest {

	Player playerOne;

	Player playerTwo;

	TennisGame tennisGame;

	@Before
	public void beforeTennisServiceImplTest() {
		playerOne = new Player();
		playerTwo = new Player();
		playerOne.setName("Dhileepan");
		playerTwo.setName("Suresh");
		tennisGame = new TennisGame();
	}

	@Test
	public void testNewGameShouldReturnLOVEAll() {

		playerOne.setScore(0);
		playerTwo.setScore(0);
		assertEquals("LOVE All", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerOneWinsFirstBall() {
		playerOne.setScore(1);
		playerTwo.setScore(0);
		assertEquals("FIFTEEN,LOVE", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerOneWinsFirstTwoBalls() {
		playerOne.setScore(2);
		playerTwo.setScore(0);
		assertEquals("THIRTY,LOVE", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerOneWinsFirstThreeBalls() {
		playerOne.setScore(3);
		playerTwo.setScore(0);
		assertEquals("FORTY,LOVE", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerOneWinsGame() {
		playerOne.setScore(4);
		playerTwo.setScore(2);
		assertEquals("Dhileepan Wins", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerTwoWinsFirstBall() {
		playerOne.setScore(0);
		playerTwo.setScore(1);
		assertEquals("LOVE,FIFTEEN", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerTwoWinsFirstTwoBalls() {
		playerOne.setScore(0);
		playerTwo.setScore(2);
		assertEquals("LOVE,THIRTY", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerTwoWinsFirstThreeBalls() {
		playerOne.setScore(0);
		playerTwo.setScore(3);
		assertEquals("LOVE,FORTY", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerTwoWinsGame() {
		playerOne.setScore(2);
		playerTwo.setScore(4);
		assertEquals("Suresh Wins", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testFIFTEENAll() {
		playerOne.setScore(1);
		playerTwo.setScore(1);
		assertEquals("FIFTEEN All", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testTHIRTYAll() {
		playerOne.setScore(2);
		playerTwo.setScore(2);
		assertEquals("THIRTY All", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayersAreDeuce() {
		playerOne.setScore(3);
		playerTwo.setScore(3);
		assertEquals("Deuce", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerOneAdvantage() {
		playerOne.setScore(5);
		playerTwo.setScore(4);
		assertEquals("Dhileepan Advantage", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerTwoAdvantage() {
		playerOne.setScore(4);
		playerTwo.setScore(5);
		assertEquals("Suresh Advantage", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerOneWinsAfterAdvantage() {
		playerOne.setScore(8);
		playerTwo.setScore(6);
		assertEquals("Dhileepan Wins", tennisGame.getScore(playerOne, playerTwo));
	}

	@Test
	public void testPlayerTwoWinsAfterAdvantage() {
		playerOne.setScore(6);
		playerTwo.setScore(8);
		assertEquals("Suresh Wins", tennisGame.getScore(playerOne, playerTwo));
	}

}