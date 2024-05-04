package com.codecrafter.indie.theguardiangate.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHelper {

	private ResponseHelper() {
		//
	}

	private static final Logger log = LoggerFactory.getLogger(ResponseHelper.class);

	public static ResponseEntity<Object> generateSuccessResponse(BaseResponse response) {
		// Log response
		log.debug("success response : {} ", response);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	public static ResponseEntity<Object> generateErrorResponse(HttpStatus httpStatus, String errorCode,
			String errorDescription) {
		return generateErrorResponse(new BaseResponse(), httpStatus, errorCode, errorDescription);
	}

	public static ResponseEntity<Object> generateExceptionResponse(Exception e) {
		// Log exception
		log.error("exception : {} ", e);

		return generateErrorResponse(new BaseResponse(), HttpStatus.INTERNAL_SERVER_ERROR, null, e.getMessage());
	}

	public static ResponseEntity<Object> generateErrorResponse(BaseResponse response, HttpStatus httpStatus,
			String errorCode, String errorDescription) {
		response.setStatus(Constants.KO);
		response.setErrorCode(errorCode);
		response.setErrorDescription(errorDescription);

		// Log response
		log.debug("error response : {} ", response);

		return new ResponseEntity<>(response, httpStatus);
	}

	public static ResponseEntity<Object> generateSuccesResponse(BaseResponse response) {
		response.setStatus(Constants.OK);

		// Log response
		log.debug("success response : {} ", response);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	public static ResponseEntity<Object> generateErrorResponse(HttpStatus httpStatus, String errorDescription) {
		return generateErrorResponse(new BaseResponse(), httpStatus, String.valueOf(httpStatus.value()),
				errorDescription);
	}

}