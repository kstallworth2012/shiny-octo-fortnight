package com.quickstart.quickstart.practice.repository;


import org.springframework.stereotype.Repository;
import com.quickstart.quickstart.practice.captable.models.Content;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository{


private final List<Content> content = new ArrayList<>();

public ContentCollectionRepository(){

	System.out.println("*********ContentCollectionRepository********");
}

public List<Content> findAll(){
	return content;
}

public Optional<Content> findById(Integer id){
	return content.stream().filter(c-> c.id().equals(id)).findFirst();
}

	
}