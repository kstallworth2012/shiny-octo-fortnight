package com.quickstart.quickstart.practice.models;

import java.time.LocalDateTime; 


public record Employee(

String employee_id,
String name, 
String email, 
String department, 
String location, 
LocalDateTime hireDate, 
LocalDateTime termination_date, 
String employment_status, 
String role){}