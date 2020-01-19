package com.royalgolf.validator;

import org.springframework.stereotype.Service;

import com.royalgolf.exception.InvalidMessageIdException;

@Service
public class Validator {

	public void isIdValid(String messageId) {
		if (messageId.length() == 2) {
			throw new InvalidMessageIdException(messageId);
		}

	}

}
