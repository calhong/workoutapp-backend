package com.workoutplanner.backend.models;

public enum TargetedGroup {
    CHEST ("CHEST"),
    CALVES ("CALVES"),
    HAMSTRINGS ("HAMSTRINGS"),
    QUADRICEPS ("QUADRICEPS"),
    GLUTES ("GLUTES"),
    BICEPS ("BICEPS"),
    TRICEPS ("TRICEPS"),
    FOREARMS ("FOREARMS"),
    TRAPEZIUS ("TRAPEZIUS"),
    LATTIMUSDORSI ("LATTIMUSDORSI");


    private final String muscleGroup;

    TargetedGroup(String muscleGroup){
        this.muscleGroup = muscleGroup;
    }

}
