package com.kata.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.kata.Game;

public class GameTest {
	Game game = new Game("Dhileepan", "Suresh");

	@Test
	public void testNewGameShouldReturnLoveAll() {
		assertEquals("Love All", game.getScore(0, 0));
	}

	@Test
	public void testPlayerOneWinsFirstBall() {
		assertEquals("Fifteen,Love", game.getScore(1, 0));
	}

	@Test
	public void testPlayerOneWinsFirstTwoBalls() {
		assertEquals("Thirty,Love", game.getScore(2, 0));
	}

	@Test
	public void testPlayerOneWinsFirstThreeBalls() {
		assertEquals("Forty,Love", game.getScore(3, 0));
	}

	@Test
	public void testPlayerOneWinsGame() {
		assertEquals("Dhileepan Wins", game.getScore(4, 2));
	}

	@Test
	public void testPlayerTwoWinsFirstBall() {
		assertEquals("Love,Fifteen", game.getScore(0, 1));
	}

	@Test
	public void testPlayerTwoWinsFirstTwoBalls() {
		assertEquals("Love,Thirty", game.getScore(0, 2));
	}

	@Test
	public void testPlayerTwoWinsFirstThreeBalls() {
		assertEquals("Love,Forty", game.getScore(0, 3));
	}

	@Test
	public void testPlayerTwoWinsGame() {
		assertEquals("Suresh Wins", game.getScore(2, 4));
	}

	@Test
	public void testFifteenAll() {
		assertEquals("Fifteen All", game.getScore(1, 1));
	}

	@Test
	public void testThirtyAll() {
		assertEquals("Thirty All", game.getScore(2, 2));
	}

	@Test
	public void testPlayersAreDeuce() {
		assertEquals("Deuce", game.getScore(3, 3));
	}

	@Test
	public void testPlayerOneAdvantage() {
		assertEquals("Dhileepan Advantage", game.getScore(5, 4));
	}

	@Test
	public void testPlayerTwoAdvantage() {
		assertEquals("Suresh Advantage", game.getScore(4, 5));
	}

	@Test
	public void testPlayerOneWinsAfterAdvantage() {
		assertEquals("Dhileepan Wins", game.getScore(8, 6));
	}

	@Test
	public void testPlayerTwoWinsAfterAdvantage() {
		assertEquals("Suresh Wins", game.getScore(6, 8));
	}

}
