package com.extended.reponse;

import lombok.Data;

@Data
public class FinalResponse {

	public boolean status;
	public String statusCode;
	public String message;
	public Object data;

}
