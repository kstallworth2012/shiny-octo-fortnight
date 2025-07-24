package com.quickstart.quickstart.practice.captable.models;

import com.quickstart.quickstart.practice.captable.models.enums.ShareHolderType;
import com.quickstart.quickstart.practice.captable.models.enums.EntityType;

public record ShareHolder(

String shareholder_id,
String name,
ShareHolderType shareholder_type,
String share_holder_email,
EntityType entity_type
	
	
){}