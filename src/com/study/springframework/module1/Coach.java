package com.study.springframework.module1;

import java.util.List;

public abstract class Coach {

	protected CoachExercisesService coachExercisesService;
	
	public Coach(CoachExercisesService coachExercisesService) {
		this.coachExercisesService = coachExercisesService;
	}
	
	public abstract String getDailyWorkout();
	
	public abstract List<String> getFullDailyWorkouts();
	
}
