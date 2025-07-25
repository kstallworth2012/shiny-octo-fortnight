package com.quickstart.quickstart.practice.models;

import java.time.LocalDateTime; 
import com.quickstart.quickstart.practice.models.Employee;
import com.quickstart.quickstart.practice.models.EquityGrant;
public record ExerciseTransaction(

String exercise_id, 
Employee employee_id, 
EquityGrant grant_id, 
LocalDateTime exercise_date, 
Integer shares_exercised, 
Double exercise_price, 
Double tax_withheld, 
Integer net_shares_received, 
Boolean form_3921_generated		
){}