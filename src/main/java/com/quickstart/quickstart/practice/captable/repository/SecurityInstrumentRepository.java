package com.quickstart.quickstart.practice.captable.repository;


import com.quickstart.quickstart.practice.captable.models.SecurityInstrument;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SecurityInstrumentRepository{


	private final List<SecurityInstrument> security = new ArrayList<>();
}