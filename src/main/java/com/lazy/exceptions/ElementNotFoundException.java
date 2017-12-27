package com.lazy.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementNotFoundException extends RuntimeException {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	public ElementNotFoundException(String msg) {
		super(msg);
	}
}
