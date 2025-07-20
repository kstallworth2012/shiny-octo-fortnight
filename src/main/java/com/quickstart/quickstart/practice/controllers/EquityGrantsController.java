package com.quickstart.quickstart.practice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/grants")
public class EquityGrantsController{}

// GET    /api/grants                     # List all grants
// GET    /api/grants/{id}                # Get details of a specific grant
// POST   /api/grants                     # Issue new grant (RSU, ISO, NSO, etc.)
// PUT    /api/grants/{id}                # Update grant terms
// DELETE /api/grants/{id}                # Revoke grant

