package com.quickstart.quickstart.practice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// GET    /api/employees                  # List all employees
// GET    /api/employees/{id}             # Get profile with equity summary
// POST   /api/employees                  # Add new employee
// PUT    /api/employees/{id}             # Update employee info
// DELETE /api/employees/{id}             # Remove employee
@RestController
@RequestMapping("/api/employees")
public class EmployeeController{}
