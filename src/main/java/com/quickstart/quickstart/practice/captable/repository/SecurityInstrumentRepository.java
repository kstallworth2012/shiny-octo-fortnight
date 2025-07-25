package com.quickstart.quickstart.practice.captable.repository;


import com.quickstart.quickstart.practice.captable.models.enums.SecurityType;
import com.quickstart.quickstart.practice.captable.models.SecurityInstrument;
import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;


@Repository
public class SecurityInstrumentRepository{


	private final List<SecurityInstrument> security = new ArrayList<>();

	public SecurityInstrumentRepository(){

				System.out.println("*********SecurityInstrumentRepository********");

	}

	public List<SecurityInstrument> findAll(){
	return security;
}

	public Optional<SecurityInstrument> findById(Integer id){
	return security.stream().filter(s-> s.security_id().equals(id)).findFirst();
}


	@PostConstruct
	private void init(){
		SecurityInstrument si = new SecurityInstrument("sd7uhno7y",SecurityType.COMMON_STOCK,"common",LocalDateTime.now(),45.45,77.77);
		security.add(si);
	}
}