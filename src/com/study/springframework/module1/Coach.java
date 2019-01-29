package com.study.springframework.module1;

import java.util.List;

public abstract class Coach {

	protected CoachExercisesService coachExercisesService;
	
	private Boolean isInVacation;

	// Default constructor para implementar Dependency Injection for Setter "TrackCoach"
	public Coach() {}
	
	public Coach(CoachExercisesService coachExercisesService) {
		this.coachExercisesService = coachExercisesService;
	}
	
	public abstract String getDailyWorkout();
	
	public abstract List<String> getFullDailyWorkouts();

	public Boolean getIsInVacation() {
		return isInVacation;
	}

	public void setIsInVacation(Boolean isInVacation) {
		this.isInVacation = isInVacation;
	}
		
}
