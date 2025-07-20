package com.quickstart.quickstart.practice.captable.repository;


import com.quickstart.quickstart.practice.captable.models.ShareHolder;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ShareHolderRepository{

	private final List<ShareHolder> shareHolder = new ArrayList<>();


}