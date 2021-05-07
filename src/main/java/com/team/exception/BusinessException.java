package com.team.exception;

import lombok.Builder;
import lombok.Data;

@Data
public class BusinessException extends Exception {
	
	
	private String message;

	@Builder
	public BusinessException(String message) {
		super(message);
		this.message = message;
	}
	
	

}
