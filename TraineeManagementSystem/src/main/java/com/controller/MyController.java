package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Trainee;
import com.service.TraineeService;


@RestController
public class MyController {
	
	@Autowired
	TraineeService tService;
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	@PostMapping("/add")
	public ResponseEntity insertData(@RequestBody Trainee trainee) {
		tService.addTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity updateData(@RequestBody Trainee trainee) {
		tService.modifyTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity deleteTrainee(@RequestBody int tId) {
		tService.deleteTrainee(tId);
		return new ResponseEntity(HttpStatus.OK);
		}
	
	@GetMapping("/getById")
	public Trainee retriveById(@RequestBody int id) {
		Trainee trainee=tService.retriveById(id);
			return trainee;
	}

	@GetMapping("/getAll")
	public ArrayList<Trainee> getAll(){
		
		ArrayList<Trainee> trainee = tService.retriveAll();
		return trainee;
	}
}
