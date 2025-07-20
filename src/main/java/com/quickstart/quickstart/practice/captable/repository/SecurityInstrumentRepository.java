package com.quickstart.quickstart.practice.captable.repository;


import com.quickstart.quickstart.practice.captable.models.SecurityInstrument;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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
	return security.stream().filter(s-> s.id().equals(id)).findFirst();
}


}