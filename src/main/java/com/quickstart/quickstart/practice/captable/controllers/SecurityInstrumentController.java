package com.quickstart.quickstart.practice.captable.controllers;

import com.quickstart.quickstart.practice.captable.repository.SecurityInstrumentRepository;
import com.quickstart.quickstart.practice.captable.models.SecurityInstrument;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/security")
public class SecurityInstrumentController{
				private final SecurityInstrumentRepository repo;

				public SecurityInstrumentController(SecurityInstrumentRepository _repo){
					this.repo = _repo;
				}

   				@GetMapping("")
   				public List<SecurityInstrument> findAll(){
   						return repo.findAll();
   				}
   		}