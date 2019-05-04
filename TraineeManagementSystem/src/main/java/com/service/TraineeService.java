package com.service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;


import com.model.Trainee;

public interface TraineeService {

		int addTrainee(Trainee trainee );
		int modifyTrainee(Trainee trainee);
		int deleteTrainee(int tId);
		Trainee retriveById(int tId);
		ArrayList<Trainee> retriveAll();
	
}
