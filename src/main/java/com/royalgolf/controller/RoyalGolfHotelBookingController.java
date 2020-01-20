package com.royalgolf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel")
public class RoyalGolfHotelBookingController {

	@RequestMapping(value = "book", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	public String book() {
		return null;

	}
}
