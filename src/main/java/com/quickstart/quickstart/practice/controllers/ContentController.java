package com.quickstart.quickstart.practice.controllers;

import com.quickstart.quickstart.practice.models.Content;
import com.quickstart.quickstart.practice.repository.ContentCollectionRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/content")
public class ContentController{
	
	private final ContentCollectionRepository repo;

	public ContentController(ContentCollectionRepository _repo){
		this.repo = _repo;
	}

   @GetMapping("")
   public List<Content> findAll(){
   			return repo.findAll();
   }

}