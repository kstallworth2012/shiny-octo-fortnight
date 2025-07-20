package com.quickstart.quickstart.practice.captable.repository;


import com.quickstart.quickstart.practice.captable.models.OwnershipRecord;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class OwnershipRecordRepository{


	private final List<OwnershipRecord> owner_record = new ArrayList<>();
}