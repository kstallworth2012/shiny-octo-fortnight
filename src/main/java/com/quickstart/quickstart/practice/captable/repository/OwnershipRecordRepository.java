package com.quickstart.quickstart.practice.captable.repository;


import com.quickstart.quickstart.practice.captable.models.OwnershipRecord;
import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class OwnershipRecordRepository{


	private final List<OwnershipRecord> owner_record = new ArrayList<>();


	public OwnershipRecordRepository(){

		System.out.println("*********OwnershipRecordRepository********");

	}
	public List<OwnershipRecord> findAll(){
	return owner_record;
}

	public Optional<OwnershipRecord> findById(Integer id){
	return owner_record.stream().filter(o-> o.ownership_id().equals(id)).findFirst();
		}


	// @PostConstruct
	// private void init(){}


}