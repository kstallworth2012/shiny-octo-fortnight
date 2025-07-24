package com.quickstart.quickstart.practice.repository;


import org.springframework.stereotype.Repository;
import com.quickstart.quickstart.practice.models.Content;
import jakarta.annotation.PostConstruct;
import com.quickstart.quickstart.practice.models.enums.Status;
import com.quickstart.quickstart.practice.models.enums.Type;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;

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

	@PostConstruct
	private void init(){
		Content c = new Content(1,"Blah","blah blah sus",Status.IN_PROGRESS,Type.VIDEO,
				LocalDateTime.now(),null);
		content.add(c);
	}
}