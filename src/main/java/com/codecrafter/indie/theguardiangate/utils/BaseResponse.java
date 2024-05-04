package com.codecrafter.indie.theguardiangate.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class BaseResponse 
{
	// Error field is optional (only for error response), it contains:
	// - error code if status is OK (http response = 200)			=> applicative error
	// - error description if status is KO (http response != 200)	=> technical error

	private String status;

	@JsonInclude(Include.NON_NULL)
    private String errorCode;

	@JsonInclude(Include.NON_NULL)
    private String errorDescription;

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String toString() {
		return "BaseResponse [status=" + status + ", errorCode=" + errorCode + ", errorDescription=" + errorDescription + "]";
	}

	

}
