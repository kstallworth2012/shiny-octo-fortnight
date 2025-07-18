package com.quickstart.quickstart.practice.captable.models;





import com.quickstart.quickstart.practice.captable.models.enums.SecurityType;



public record SecurityInstrument(
	

	String security_id,
	SecurityType security_type,
	String share_class,
	LocalDateTime issue_date,
	Double strike_price,
	Double conversion
	)
{}