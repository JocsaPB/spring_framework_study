package com.study.springframework.module1.impl;

import java.util.Arrays;
import java.util.List;

import com.study.springframework.module1.CoachExercisesService;

public class SoccerCoachExercisesService implements CoachExercisesService {

	@Override
	public List<String> getExercises() {
		return Arrays.asList("Kick balls to the goal one Hundred Times", "Defenses", "Two touchs");
	}

}
