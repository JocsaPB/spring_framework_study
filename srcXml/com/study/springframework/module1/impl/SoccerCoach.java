package com.study.springframework.module1.impl;

import java.util.List;

import com.study.springframework.module1.Coach;
import com.study.springframework.module1.CoachExercisesService;

public class SoccerCoach extends Coach {

	public SoccerCoach(CoachExercisesService coachExercises) {
		super(coachExercises);
	}
	
	@Override
	public String getDailyWorkout() {
		return "Kick the ball to the goal a hundred times!";
	}

	@Override
	public List<String> getFullDailyWorkouts() {
		return coachExercisesService.getExercises();
	}
	
}
