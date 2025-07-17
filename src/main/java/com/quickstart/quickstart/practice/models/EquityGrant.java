package com.quickstart.quickstart.practice.models;

import java.time.LocalDateTime; 



public record EquityGrant(

  String grant_id,
  String grant_type,
  LocalDateTime issue_date, 
  LocalDateTime expiration_date, 
  Integer number_of_shares, 
  Double strike_price, 
  Double fair_market_value, 
  String vesting_schedule_id, 
  String status
){}