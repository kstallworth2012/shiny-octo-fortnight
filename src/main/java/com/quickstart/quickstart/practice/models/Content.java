package com.quickstart.quickstart.practice.models;

import java.time.LocalDateTime; 
import com.quickstart.quickstart.practice.models.enums.Status;
import com.quickstart.quickstart.practice.models.enums.Type;



public record Content(

Integer id, 
String title, 
String desc,
Status status, 
Type contentType, 
LocalDateTime dateCreated, 
LocalDateTime dateUpdated,
String url

){}