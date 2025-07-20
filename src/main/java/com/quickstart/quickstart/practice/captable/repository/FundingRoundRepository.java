package com.quickstart.quickstart.practice.captable.repository;


import com.quickstart.quickstart.practice.captable.models.FundingRound;
import org.springframework.stereotype.Repository;
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
	return fund_round.stream().filter(f-> f.id().equals(id)).findFirst();
		}
}