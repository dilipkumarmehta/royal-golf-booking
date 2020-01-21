package com.royalgolf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class RoyalGolfHotelSearchController {
	@RequestMapping(value = "search", method = RequestMethod.GET, produces = "application/jon", consumes = "application/jon")
	public String book() {
		return null;

	}
}
