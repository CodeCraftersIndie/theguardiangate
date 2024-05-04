package com.codecrafter.indie.theguardiangate.model.article;

import com.codecrafter.indie.theguardiangate.utils.BaseResponse;

public class ApiResponse extends BaseResponse{
	
	private ResponseField response;

	public ResponseField getResponse() {
		return response;
	}

	public void setResponse(ResponseField response) {
		this.response = response;
	}

}
