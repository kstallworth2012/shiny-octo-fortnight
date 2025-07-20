package com.quickstart.quickstart.practice.captable.repository;



import com.quickstart.quickstart.practice.captable.models.ValuationSnapshot;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ValuationSnapshotRepository{


	private final List<ValuationSnapshot> snapShot = new ArrayList<>();
}