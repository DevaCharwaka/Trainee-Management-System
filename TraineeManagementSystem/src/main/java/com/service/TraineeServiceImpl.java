package com.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dao.TraineeMgmtIDao;
import com.model.Trainee;

@Component("tService")
@Service
@Transactional

public class TraineeServiceImpl implements TraineeService{

@Autowired
TraineeMgmtIDao traineedao;
	
	@Override
	public int addTrainee(Trainee trainee) {
		
		return traineedao.addTrainee(trainee);
	}

	@Override
	public int modifyTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return traineedao.modifyTrainee(trainee);
	}

	@Override
	public int deleteTrainee(int tId) {
		// TODO Auto-generated method stub
		return traineedao.deleteTrainee(tId);
	}

	@Override
	public Trainee retriveById(int tId) {
		// TODO Auto-generated method stub
		return traineedao.retriveById(tId);
	}

	@Override
	public ArrayList<Trainee> retriveAll() {
		// TODO Auto-generated method stub
		return traineedao.retriveAll();
	}

}
