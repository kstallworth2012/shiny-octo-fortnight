package com.quickstart.quickstart.practice.controllers;


GET    /api/exercises                  # Employee-initiated exercises
POST   /api/exercises                  # Execute grant exercise
GET    /api/tax-reporting              # Generate Form 3921 / 6039

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/exercises")