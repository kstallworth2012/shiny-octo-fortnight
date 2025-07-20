package com.quickstart.quickstart.practice.captable.repository;


import com.quickstart.quickstart.practice.captable.models.ShareHolder;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


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
	return shareHolder.stream().filter(h-> h.id().equals(id)).findFirst();
		}


}