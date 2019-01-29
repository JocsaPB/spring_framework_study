package com.study.springframework.module1.impl;

import java.util.List;

import com.study.springframework.module1.Coach;
import com.study.springframework.module1.CoachExercisesService;

public class TrackCoach extends Coach {

	public TrackCoach(CoachExercisesService coachExercisesService) {
		super(coachExercisesService);
	}

	@Override
	public String getDailyWorkout() {
		return "Run a 5k!";
	}

	@Override
	public List<String> getFullDailyWorkouts() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
