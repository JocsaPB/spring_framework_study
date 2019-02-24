package com.study.springframework.module1.impl;

import java.util.Arrays;
import java.util.List;

import com.study.springframework.module1.Coach;
import com.study.springframework.module1.CoachExercisesService;

public class TrackCoach extends Coach {

	@Override
	public String getDailyWorkout() {
		return "Run a 5k!";
	}

	@Override
	public List<String> getFullDailyWorkouts() {
		return Arrays.asList("Run a 5k!", "Run a 10k!");
	}
	
	public void setCoachExercisesService(CoachExercisesService coachExercisesService) {
		this.coachExercisesService = coachExercisesService;
	}
	
	public void init() {
		System.out.println("Init TrackCoach");
	}
	
	public void destroy() {
		System.out.println("Destroy TrackCoach");
	}
	
}
