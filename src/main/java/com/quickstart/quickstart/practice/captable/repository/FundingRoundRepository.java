package com.quickstart.quickstart.practice.captable.repository;


import com.quickstart.quickstart.practice.captable.models.FundingRound;
import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class FundingRoundRepository{

	private final List<FundingRound> fund_round = new ArrayList<>();




	public FundingRoundRepository(){
						System.out.println("*********FundingRoundRepository********");

	}
 
 	public List<FundingRound> findAll(){
			return fund_round;
		}

	public Optional<FundingRound> findById(Integer id){
	return fund_round.stream().filter(f-> f.round_id().equals(id)).findFirst();
		}



	@PostConstruct
	private void init(){

		FundingRound f = new FundingRound("a87hoiho","second round",90090909,776555,7000);
		fund_round.add(f);

	}
}