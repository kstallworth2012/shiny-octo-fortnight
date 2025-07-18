package com.quickstart.quickstart.practice.captable.models;



public record FundingRound(
	String round_id,
	String round_type,
	Integer pre_money,
	Integer post_money,
	Integer new_shares
){}
