package com.sample.learn.controller;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.learn.candidateDetails.CandidateModel;
import com.sample.learn.repositories.CandidateRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/candidate")
public class CandidateController {

	@Autowired
	private CandidateRepository candidateRepo;

	@Autowired
	MongoTemplate mongoTemplate;

	@PostMapping("/save")
	public CandidateModel saveCandidateDetails(@Valid @RequestBody CandidateModel candDet) {
		System.out.println(candDet.getCandidateName());
		candDet.setId(ObjectId.get()); //
		candidateRepo.save(candDet);
		return candDet;
	}
}
