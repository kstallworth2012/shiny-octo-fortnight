package com.quickstart.quickstart.practice.captable.repository;



import com.quickstart.quickstart.practice.captable.models.ValuationSnapshot;
import org.springframework.stereotype.Repository;

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
	return snapShot.stream().filter(s-> s.id().equals(id)).findFirst();
}

}