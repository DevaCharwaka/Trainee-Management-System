package com.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.model.Trainee;
@Component("dao")
@Repository
@ComponentScan("com")
public class TraineeMgmtDaoImpl implements TraineeMgmtIDao{

	@PersistenceContext
	EntityManager entityManager;
	

	@Override
	public int addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
		return 0;
	}

	@Override
	public int modifyTrainee(Trainee trainee) {
		entityManager.merge(trainee);
			return 0;
	}

	@Override
	public int deleteTrainee(int tId) {
		Trainee trainee =new Trainee();
		trainee.setTraineeId(tId);  
		entityManager.remove(retriveById(tId));
		return 0;
	}

	@Override
	public Trainee retriveById(int tId) {

		Trainee trainee=entityManager.find(Trainee.class, tId);	
		return trainee;
	}

	@Override
	public ArrayList<Trainee> retriveAll() {

		
		Query query = (Query) entityManager.createQuery("from Trainee");
		ArrayList<Trainee> list = (ArrayList<Trainee>) query.list();
	return list;
	}

	
}
