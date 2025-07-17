package com.quickstart.quickstart.practice.models;

import java.time.LocalDateTime; 


public record VestingEvent(

String vesting_id, 
String grant_id, 
LocalDateTime vesting_date, 
Integer vested_shares, 
String vesting_type, 
String vesting_status
){}