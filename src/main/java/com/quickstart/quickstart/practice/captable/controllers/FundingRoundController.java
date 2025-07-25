package com.quickstart.quickstart.practice.captable.controllers;


import com.quickstart.quickstart.practice.captable.repository.FundingRoundRepository;
import com.quickstart.quickstart.practice.captable.models.FundingRound;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/fund-round")
public class FundingRoundController{
			private final FundingRoundRepository repo;

	public FundingRoundController(FundingRoundRepository _repo){
		this.repo = _repo;
	}

   @GetMapping("")
   public List<FundingRound> findAll(){
   			return repo.findAll();
   }
}