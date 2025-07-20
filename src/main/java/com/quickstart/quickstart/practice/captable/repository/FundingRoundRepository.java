package com.quickstart.quickstart.practice.captable.repository;


import com.quickstart.quickstart.practice.captable.models.FundingRound;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FundingRoundRepository{

	private final List<FundingRound> fund_round = new ArrayList<>();
}