package com.quickstart.quickstart.practice.captable.repository;


import com.quickstart.quickstart.practice.captable.models.enums.ShareHolderType;
import com.quickstart.quickstart.practice.captable.models.enums.EntityType;
import com.quickstart.quickstart.practice.captable.models.ShareHolder;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import jakarta.annotation.PostConstruct;


@Repository
public class ShareHolderRepository{

	private final List<ShareHolder> shareHolder = new ArrayList<>();

	public ShareHolderRepository(){

				System.out.println("*********ShareHolderRepository********");

	}

	 	public List<ShareHolder> findAll(){
			return shareHolder;
		}

	public Optional<ShareHolder> findById(Integer id){
	return shareHolder.stream().filter(h-> h.shareholder_id().equals(id)).findFirst();
		}

	@PostConstruct
	private void init(){

		ShareHolder s = new ShareHolder("joiupohp","James Chin",ShareHolderType.FOUNDER,"jchin@chinupai.com",EntityType.INDIVIDUAL);
		shareHolder.add(s);
	}

}