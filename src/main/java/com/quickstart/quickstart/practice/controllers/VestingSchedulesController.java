package com.quickstart.quickstart.practice.controllers;

/*
GET    /api/vesting                    # View all vesting events
GET    /api/vesting/{id}               # Details of specific vesting event
POST   /api/vesting                    # Create vesting timeline for grant
PUT    /api/vesting/{id}               # Update vesting milestones
DELETE /api/vesting/{id}               # Remove vesting record
*/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/vesting")
public class VestingSchedulesController {}