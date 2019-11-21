package com.kata.util;

import java.util.HashMap;
import java.util.Map;

public enum PointsEnum {

	LOVE(0), FIFTEEN(1), THIRTY(2), FORTY(3);

	private static final Map<Integer, PointsEnum> LOOKUP = new HashMap();

	static {
		for (PointsEnum pointsEnum : PointsEnum.values())
			LOOKUP.put(pointsEnum.getPoints(), pointsEnum);
	}

	private PointsEnum(final int points) {
		this.points = points;
	}

	private int points;

	public int getPoints() {
		return points;
	}

	public static PointsEnum get(int points) {
		return LOOKUP.get(points);
	}

}