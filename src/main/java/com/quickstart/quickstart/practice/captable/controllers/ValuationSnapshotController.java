package com.quickstart.quickstart.practice.captable.controllers;



import com.quickstart.quickstart.practice.captable.repository.ValuationSnapshotRepository;
import com.quickstart.quickstart.practice.captable.models.ValuationSnapshot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/snapshots")
public class ValuationSnapshotController{

		private final ValuationSnapshotRepository repo;

	public ValuationSnapshotController(ValuationSnapshotRepository _repo){
		this.repo = _repo;
	}

   @GetMapping("")
   public List<ValuationSnapshot> findAll(){
   			return repo.findAll();
   }
}