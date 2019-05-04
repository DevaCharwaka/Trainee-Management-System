package com.dao;

import java.util.ArrayList;

import com.model.Trainee;


public interface TraineeMgmtIDao {

		int addTrainee(Trainee trainee );
		int modifyTrainee(Trainee trainee);
		int deleteTrainee(int tId);
		Trainee retriveById(int tId);
		ArrayList<Trainee> retriveAll();
	
}
