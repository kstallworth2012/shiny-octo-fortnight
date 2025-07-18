package com.quickstart.quickstart.practice.captable.models;




public record ValuationSnapshot(
		String valuation_id,
		LocalDateTime snapshot_date,
		Double a_value409,
		Integer total_shares
){}