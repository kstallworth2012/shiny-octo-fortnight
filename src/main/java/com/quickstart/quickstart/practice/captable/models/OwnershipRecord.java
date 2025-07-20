package com.quickstart.quickstart.practice.captable.models;


import com.quickstart.quickstart.practice.captable.models.SecurityInstrument;
import com.quickstart.quickstart.practice.captable.models.ShareHolder;


public record OwnershipRecord(

		String ownership_id,
		ShareHolder shareHolder_id,
		SecurityInstrument security,
		Integer shares_owned,
		Double ownership_percentage

){}