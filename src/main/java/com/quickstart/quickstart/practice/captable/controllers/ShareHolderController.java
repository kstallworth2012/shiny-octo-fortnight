package com.quickstart.quickstart.practice.captable.controllers;



import com.quickstart.quickstart.practice.captable.repository.ShareHolderRepository;
import com.quickstart.quickstart.practice.captable.models.ShareHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/shareholders")
public class ShareHolderController{



				private final ShareHolderRepository repo;

				public ShareHolderController(ShareHolderRepository _repo){
					this.repo = _repo;
				}

   				@GetMapping("")
   				public List<ShareHolder> findAll(){
   						return repo.findAll();
   				}


}