package com.quickstart.quickstart.practice.captable.repository;



import com.quickstart.quickstart.practice.captable.models.ValuationSnapshot;
import org.springframework.stereotype.Repository;
import jakarta.annotation.PostConstruct;
import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class ValuationSnapshotRepository{


	private final List<ValuationSnapshot> snapShot = new ArrayList<>();


public ValuationSnapshotRepository(){
					System.out.println("*********ValuationSnapshotRepository********");

}

  public List<ValuationSnapshot> findAll(){
	return snapShot;
}

public Optional<ValuationSnapshot> findById(Integer id){
	return snapShot.stream().filter(s -> s.valuation_id().equals(id)).findFirst();
}

@PostConstruct
	private void init(){
		ValuationSnapshot v = new ValuationSnapshot("7d8uh8y",LocalDateTime.now(),99.99,2000);
		snapShot.add(v);
	}


}