package com.quickstart.quickstart.practice.captable.models;





public record OwnershipRecord(

		String ownership_id,
		Shareholder shareHolder_id,
		SecurityInstrument security,
		Integer shares_owned,
		Double ownership_percentage

){}